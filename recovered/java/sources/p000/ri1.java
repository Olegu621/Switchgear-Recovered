            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ri1 implements MethodChannel.MethodCallHandler {

                /* JADX INFO: renamed from: a */
                public final C0168b5 f16080a;

                /* JADX INFO: renamed from: b */
                public final id2 f16081b;

                public ri1(C0168b5 c0168b5, id2 id2Var) {
/* 1 */             id2Var.getClass();
/* 7 */             this.f16080a = c0168b5;
/* 9 */             this.f16081b = id2Var;
                }

                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    MethodChannel.Result result2;
/* 1 */             methodCall.getClass();
/* 4 */             result.getClass();
/* 11 */            if (!(methodCall.arguments instanceof Map)) {
/* 103 */               C1951n4.m6859j("Map arguments expected");
/* 106 */               return;
                    }
/* 13 */            id2 id2Var = this.f16081b;
/* 15 */            id2Var.getClass();
/* 18 */            AtomicBoolean atomicBoolean = id2Var.f9555b;
/* 28 */            if (!atomicBoolean.compareAndSet(true, false) && (result2 = id2Var.f9554a) != null) {
/* 44 */                result2.success("dev.fluttercommunity.plus/share/unavailable");
                    }
/* 47 */            SharePlusPendingIntent.f7148a = HttpUrl.FRAGMENT_ENCODE_SET;
/* 49 */            atomicBoolean.set(false);
/* 52 */            id2Var.f9554a = result;
                    try {
/* 62 */                if (!Intrinsics.m6216a(methodCall.method, FirebaseAnalytics.Event.SHARE)) {
/* 81 */                    result.notImplemented();
/* 84 */                    return;
                        }
/* 64 */                C0168b5 c0168b5 = this.f16080a;
/* 66 */                Object objArguments = methodCall.arguments();
/* 70 */                objArguments.getClass();
/* 75 */                c0168b5.m1252G((Map) objArguments);
                    } catch (Throwable th) {
/* 85 */                atomicBoolean.set(true);
/* 89 */                id2Var.f9554a = null;
/* 97 */                result.error("Share failed", th.getMessage(), th);
                    }
                }
            }
