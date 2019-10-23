<template>
  <div class="div-item">
    <b-list-group v-for=" i in 10 " :key="i">
      <ListItem
        post="Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam."
      />
    </b-list-group>
  </div>
</template>

<script>
import ListItem from "./MylisteItem";
export default {
  components: {
    ListItem
  },
  date() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.div-item {
  overflow-wrap: break-word;
  width: 20%;
  height: 90vh;
  float: right;
  position: fixed;
  right: 0;
  overflow: auto;
}
</style>
