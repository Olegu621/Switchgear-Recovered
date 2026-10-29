            package com.pichillilorenzo.flutter_inappwebview_android.tracing;

            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.Arrays;
            import p000.pq2;
            import p000.qq2;
            import p000.rq2;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TracingControllerManager implements Disposable {
                protected static final String LOG_TAG = "TracingControllerMan";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
                public static rq2 tracingController;
                public TracingControllerChannelDelegate channelDelegate;
                public InAppWebViewFlutterPlugin plugin;

                public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 4 */             this.plugin = inAppWebViewFlutterPlugin;
/* 20 */            this.channelDelegate = new TracingControllerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
                }

                public static pq2 buildTracingConfig(TracingSettings tracingSettings) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 13 */            int i = 0;
/* 18 */            for (Object obj : tracingSettings.categories) {
/* 26 */                if (obj instanceof String) {
/* 39 */                    arrayList.addAll(Arrays.asList((String) obj));
                        }
/* 44 */                if (obj instanceof Integer) {
/* 58 */                    i |= new int[]{((Integer) obj).intValue()}[0];
                        }
                    }
/* 60 */            Integer num = tracingSettings.tracingMode;
/* 72 */            return new pq2(arrayList, i, num != null ? num.intValue() : 1);
                }

                public static void init() {
/* 3 */             if (tracingController == null && xe2.m9786x("TRACING_CONTROLLER_BASIC_USAGE")) {
/* 15 */                tracingController = qq2.f15708a;
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
/* 4 */             if (tracingControllerChannelDelegate != null) {
/* 6 */                 tracingControllerChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            this.plugin = null;
                }
            }
