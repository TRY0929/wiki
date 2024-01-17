<template>
    <a-layout id="app">
      <wiki-header></wiki-header>
      <router-view></router-view>
      <wiki-footer></wiki-footer>
    </a-layout>
</template>

<script lang="ts" setup>
import WikiHeader from "@/components/WikiHeader.vue";
import WikiFooter from "@/components/WikiFooter.vue";
</script>

<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
#app {
  height: 100%;
  width: 100%;
}
</style>
