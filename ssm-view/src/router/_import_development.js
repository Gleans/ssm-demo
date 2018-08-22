// module.exports = file => require('@/components/' + file + '.vue').default // vue-loader at least v13.0.0+
module.exports = file => (resolve) => require(['@/components/' + file + '.vue'], resolve)
