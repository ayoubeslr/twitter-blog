<template>
  <div class="div-item">
    <b-list-group v-for=" i in 10 " :key="i">
      <ListItem post="TOP POST " />
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
  background-color: darkgoldenrod;
  overflow-wrap: break-word;
  width: 20%;
  height: 90vh;
  float: right;
  overflow: auto;
}
</style>
