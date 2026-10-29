            package com.pichillilorenzo.flutter_inappwebview_android.print_job;

            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PrintJobManager implements Disposable {
                protected static final String LOG_TAG = "PrintJobManager";
                public final Map<String, PrintJobController> jobs = new HashMap();
                public InAppWebViewFlutterPlugin plugin;

                public PrintJobManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 11 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 15 */            for (PrintJobController printJobController : this.jobs.values()) {
/* 23 */                if (printJobController != null) {
/* 25 */                    printJobController.dispose();
                        }
                    }
/* 31 */            this.jobs.clear();
/* 35 */            this.plugin = null;
                }
            }
