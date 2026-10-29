            package io.flutter.plugin.text;

            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.os.Build;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.PluginRegistry;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProcessTextPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, ProcessTextChannel.ProcessTextMethodHandler {
                private static final String TAG = "ProcessTextPlugin";
                private ActivityPluginBinding activityBinding;
                private final PackageManager packageManager;
                private final ProcessTextChannel processTextChannel;
                private Map<Integer, MethodChannel.Result> requestsByCode = new HashMap();
                private Map<String, ResolveInfo> resolveInfosById;

                public ProcessTextPlugin(ProcessTextChannel processTextChannel) {
/* 11 */            this.processTextChannel = processTextChannel;
/* 15 */            this.packageManager = processTextChannel.packageManager;
/* 17 */            processTextChannel.setMethodHandler(this);
                }

                private void cacheResolveInfos() {
/* 6 */             this.resolveInfosById = new HashMap();
/* 21 */            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
/* 25 */            int i = Build.VERSION.SDK_INT;
/* 27 */            PackageManager packageManager = this.packageManager;
/* 55 */            for (ResolveInfo resolveInfo : i >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
/* 65 */                String str = resolveInfo.activityInfo.name;
/* 73 */                resolveInfo.loadLabel(this.packageManager).toString();
/* 78 */                this.resolveInfosById.put(str, resolveInfo);
                    }
                }

                public void destroy() {
/* 4 */             this.processTextChannel.setMethodHandler(null);
                }

                @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener, com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener
                public boolean onActivityResult(int i, int i2, Intent intent) {
/* 11 */            if (!this.requestsByCode.containsKey(Integer.valueOf(i))) {
/* 13 */                return false;
                    }
/* 38 */            this.requestsByCode.remove(Integer.valueOf(i)).success(i2 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
/* 41 */            return true;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             this.activityBinding = activityPluginBinding;
/* 3 */             activityPluginBinding.addActivityResultListener(this);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivity() {
/* 3 */             this.activityBinding.removeActivityResultListener(this);
/* 7 */             this.activityBinding = null;
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onDetachedFromActivityForConfigChanges() {
/* 3 */             this.activityBinding.removeActivityResultListener(this);
/* 7 */             this.activityBinding = null;
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             this.activityBinding = activityPluginBinding;
/* 3 */             activityPluginBinding.addActivityResultListener(this);
                }

                @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
                public void processTextAction(String str, String str2, boolean z, MethodChannel.Result result) {
/* 6 */             if (this.activityBinding == null) {
/* 10 */                result.error("error", "Plugin not bound to an Activity", null);
/* 13 */                return;
                    }
/* 14 */            Map<String, ResolveInfo> map = this.resolveInfosById;
/* 16 */            if (map == null) {
/* 20 */                result.error("error", "Can not process text actions before calling queryTextActions", null);
/* 23 */                return;
                    }
/* 24 */            ResolveInfo resolveInfo = map.get(str);
/* 30 */            if (resolveInfo == null) {
/* 34 */                result.error("error", "Text processing activity not found", null);
/* 37 */                return;
                    }
/* 38 */            int iHashCode = result.hashCode();
/* 48 */            this.requestsByCode.put(Integer.valueOf(iHashCode), result);
/* 53 */            Intent intent = new Intent();
/* 56 */            ActivityInfo activityInfo = resolveInfo.activityInfo;
/* 62 */            intent.setClassName(activityInfo.packageName, activityInfo.name);
/* 67 */            intent.setAction("android.intent.action.PROCESS_TEXT");
/* 72 */            intent.setType("text/plain");
/* 77 */            intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
/* 82 */            intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
/* 91 */            this.activityBinding.getActivity().startActivityForResult(intent, iHashCode);
                }

                @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
                public Map<String, String> queryTextActions() {
/* 3 */             if (this.resolveInfosById == null) {
/* 5 */                 cacheResolveInfos();
                    }
/* 10 */            HashMap map = new HashMap();
/* 27 */            for (String str : this.resolveInfosById.keySet()) {
/* 53 */                map.put(str, this.resolveInfosById.get(str).loadLabel(this.packageManager).toString());
                    }
/* 57 */            return map;
                }
            }
