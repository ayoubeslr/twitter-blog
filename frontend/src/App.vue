<template>
  <div id="app">
    <Header />
    <div class="element">
      <Group />
      <Wall />
      <TopListePost />
    </div>
  </div>
</template>

<script>
import Header from "./components/Header.vue";
import TopListePost from "./components/MyMutltipleListItem";
import Wall from "./components/Wall";
import Group from "./components/Group";

export default {
  name: "app",
  components: {
    Header,
    TopListePost,
    Wall,
    Group
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

.element {
  padding-top: 56px;
}
</style>
