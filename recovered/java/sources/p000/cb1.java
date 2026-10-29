            package p000;

            import android.content.Context;
            import androidx.appcompat.widget.LinearLayoutCompat;
            import io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt;
            import java.io.File;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class cb1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2816a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Context f2817b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public cb1(Context context, hw1 hw1Var) {
/* 7 */             super(0);
/* 2 */             this.f2816a = 2;
/* 4 */             this.f2817b = context;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f2816a;
/* 3 */             Context context = this.f2817b;
                    switch (i) {
                        case 0:
/* 58 */                    context.getClass();
/* 61 */                    File cacheDir = context.getCacheDir();
/* 65 */                    cacheDir.getClass();
/* 68 */                    return new C0835d8(cacheDir);
                        case 1:
/* 52 */                    return new c41(context);
                        case 2:
/* 19 */                    context.getClass();
/* 46 */                    return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(SharedPreferencesPluginKt.SHARED_PREFERENCES_NAME.concat(".preferences_pb")));
                        default:
/* 11 */                    LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context, null);
/* 15 */                    linearLayoutCompat.setOrientation(1);
/* 18 */                    return linearLayoutCompat;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 10 */        public /* synthetic */ cb1(Context context, int i) {
                    super(0);
/* 11 */            this.f2816a = i;
                    this.f2817b = context;
                }
            }
