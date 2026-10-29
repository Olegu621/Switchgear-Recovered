            package com.pichillilorenzo.flutter_inappwebview_android.print_job;

            import android.print.PrintJob;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
            import io.flutter.plugin.common.MethodChannel;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PrintJobController implements Disposable {
                protected static final String LOG_TAG = "PrintJob";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_printjobcontroller_";
                public PrintJobChannelDelegate channelDelegate;

                /* JADX INFO: renamed from: id */
                public String f5328id;
                public PrintJob job;
                public InAppWebViewFlutterPlugin plugin;
                public PrintJobSettings settings;

                public PrintJobController(String str, PrintJob printJob, PrintJobSettings printJobSettings, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 4 */             this.f5328id = str;
/* 6 */             this.plugin = inAppWebViewFlutterPlugin;
/* 8 */             this.job = printJob;
/* 10 */            this.settings = printJobSettings;
/* 30 */            this.channelDelegate = new PrintJobChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, AbstractC0886en.m3507k(METHOD_CHANNEL_NAME_PREFIX, str)));
                }

                public void cancel() {
/* 1 */             PrintJob printJob = this.job;
/* 3 */             if (printJob != null) {
/* 5 */                 printJob.cancel();
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
                    PrintJobManager printJobManager;
/* 1 */             PrintJobChannelDelegate printJobChannelDelegate = this.channelDelegate;
/* 4 */             if (printJobChannelDelegate != null) {
/* 6 */                 printJobChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 13 */            if (inAppWebViewFlutterPlugin != null && (printJobManager = inAppWebViewFlutterPlugin.printJobManager) != null && printJobManager.jobs.containsKey(this.f5328id)) {
/* 33 */                printJobManager.jobs.put(this.f5328id, null);
                    }
/* 36 */            PrintJob printJob = this.job;
/* 38 */            if (printJob != null) {
/* 40 */                printJob.cancel();
/* 43 */                this.job = null;
                    }
/* 45 */            this.plugin = null;
                }

                public void disposeNoCancel() {
                    PrintJobManager printJobManager;
/* 1 */             PrintJobChannelDelegate printJobChannelDelegate = this.channelDelegate;
/* 4 */             if (printJobChannelDelegate != null) {
/* 6 */                 printJobChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 13 */            if (inAppWebViewFlutterPlugin != null && (printJobManager = inAppWebViewFlutterPlugin.printJobManager) != null && printJobManager.jobs.containsKey(this.f5328id)) {
/* 33 */                printJobManager.jobs.put(this.f5328id, null);
                    }
/* 38 */            if (this.job != null) {
/* 40 */                this.job = null;
                    }
/* 42 */            this.plugin = null;
                }

                public PrintJobInfoExt getInfo() {
/* 1 */             PrintJob printJob = this.job;
/* 3 */             if (printJob != null) {
/* 9 */                 return PrintJobInfoExt.fromPrintJobInfo(printJob.getInfo());
                    }
/* 14 */            return null;
                }

                public void restart() {
/* 1 */             PrintJob printJob = this.job;
/* 3 */             if (printJob != null) {
/* 5 */                 printJob.restart();
                    }
                }
            }
