            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import com.supercell.p007id.scid_plugin.MobileScannerHandler;
            import com.supercell.p007id.scid_plugin.mobile_scanner.objects.MobileScannerStartParameters;
            import io.flutter.plugin.common.MethodChannel;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ij1 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9633a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MethodChannel.Result f9634b;

                public /* synthetic */ ij1(int i, MethodChannel.Result result) {
/* 1 */             this.f9633a = i;
/* 3 */             this.f9634b = result;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f9633a;
/* 3 */             MethodChannel.Result result = this.f9634b;
                    switch (i) {
                        case 0:
/* 1 */                     return MobileScannerHandler.start$lambda$7(result, (MobileScannerStartParameters) obj);
                        case 1:
/* 41 */                    mj1 mj1Var = (mj1) obj;
/* 43 */                    mj1Var.getClass();
/* 61 */                    new Handler(Looper.getMainLooper()).post(new ji1(2, result, mj1Var));
/* 64 */                    return Unit.f12910a;
                        case 2:
/* 1 */                     return MobileScannerHandler.start$lambda$9(result, (Exception) obj);
                        default:
/* 8 */                     Exception exc = (Exception) obj;
/* 10 */                    exc.getClass();
/* 28 */                    new Handler(Looper.getMainLooper()).post(new hj1(exc, result, 1));
/* 31 */                    return Unit.f12910a;
                    }
                }
            }
