import axios from 'axios';

axios.defaults.baseURL = process.env.VUE_APP_SERVER;

axios.interceptors.request.use(function (config) {
  console.log('----request config: ', config);
  return config;
}, function (error) {
  return Promise.reject(error);
});

axios.interceptors.response.use(function (response) {
  console.log('----response content: ', response);
  return response;
}, function (error) {
  return Promise.reject(error);
});
