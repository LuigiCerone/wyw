module.exports = {
  outputDir: 'docker/dist',
  lintOnSave: true,
  pages: {
    index: {
      entry: 'src/main.js',
      title: 'WhatYouWatched - Service Oriented Software Engineering 2019/20',
    },
  },
  pwa: {
    name: 'WYW',
    themeColor: '#ffc107',
    msTileColor: '#000000',
    appleMobileWebAppCapable: 'yes',
    appleMobileWebAppStatusBarStyle: 'black',
  },
};
