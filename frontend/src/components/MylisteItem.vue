<template>
  <b-list-group-item>{{post}}</b-list-group-item>
</template>

<script>
export default {
  props: {
    post: String
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.list-group-item {
  margin: 15px 0 15px 0;
}
</style>
