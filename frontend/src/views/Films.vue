<template>
  <div>
    <div v-if="error">
      <b-alert show="6" variant="warning" dismissible fade>
        {{ error }}
      </b-alert>
    </div>

    <h3>Films <small v-if="query" class="font-weight-light">with '{{query}}' in the title</small></h3>
    <FilmList :films="films"/>
  </div>
</template>

<script>
import ApiService from '../common/api.service';
import FilmList from '../components/FilmList.vue';

export default {
  name: 'Films',
  components: { FilmList },
  data() {
    return {
      error: null,
      films: [],
      query: '',
    };
  },
  created() {
    // fetch the data when the view is created
    this.fetchFilms();
  },
  watch: {
    // call again the method if the route changes
    '$route.query.query': 'fetchFilms',
  },
  methods: {
    fetchFilms() {
      this.error = null;
      this.query = this.$route.query.query;

      const params = this.query ? { query: this.query } : {};

      ApiService.get('/filmservice/film', params)
        .then((films) => {
          this.films = films;
        })
        .catch((error) => {
          this.error = error.toString();
        });
    },
    search() {
      this.$router.push({ query: { query: this.query } });
    },
  },
};
</script>
