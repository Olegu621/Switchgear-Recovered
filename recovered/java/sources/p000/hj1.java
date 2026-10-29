            package p000;

            import com.supercell.p007id.scid_plugin.MobileScannerHandler;
            import io.flutter.plugin.common.MethodChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class hj1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9097a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Exception f9098b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ MethodChannel.Result f9099c;

                public /* synthetic */ hj1(Exception exc, MethodChannel.Result result, int i) {
/* 1 */             this.f9097a = i;
/* 3 */             this.f9098b = exc;
/* 5 */             this.f9099c = result;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f9097a) {
                        case 0:
/* 1 */                     MobileScannerHandler.start$lambda$9$lambda$8(this.f9098b, this.f9099c);
                            break;
                        default:
/* 6 */                     Exception exc = this.f9098b;
/* 8 */                     boolean z = exc instanceof C2208t7;
/* 10 */                    MethodChannel.Result result = this.f9099c;
/* 15 */                    if (z) {
/* 19 */                        result.error("MobileScanner", "Called start() while already started", null);
                            } else if (exc instanceof C2226tp) {
/* 29 */                        result.error("MobileScanner", "Error occurred when setting up camera!", null);
                            } else if (!(exc instanceof ln1)) {
/* 45 */                        result.error("MobileScanner", "Unknown error occurred.", null);
                            } else {
/* 39 */                        result.error("MobileScanner", "No camera found or failed to open camera!", null);
                            }
                            break;
                    }
                }
            }
