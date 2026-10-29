            package p000;

            import android.os.Bundle;
            import androidx.appcompat.app.AppCompatActivity;
            import java.util.ArrayList;
            import java.util.LinkedHashSet;
            
            /* JADX INFO: renamed from: z9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class C2527z9 implements w62 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19992a;

                /* JADX INFO: renamed from: b */
                public final Object f19993b;

                public C2527z9(x62 x62Var) {
/* 2 */             this.f19992a = 1;
/* 12 */            this.f19993b = new LinkedHashSet();
/* 16 */            x62Var.m9724c("androidx.savedstate.Restarter", this);
                }

                @Override // p000.w62
                /* JADX INFO: renamed from: a */
                public final Bundle mo671a() {
/* 1 */             int i = this.f19992a;
/* 3 */             Object obj = this.f19993b;
                    switch (i) {
                        case 0:
/* 28 */                    Bundle bundle = new Bundle();
/* 37 */                    ((AppCompatActivity) obj).getDelegate().getClass();
/* 40 */                    return bundle;
                        default:
/* 10 */                    Bundle bundle2 = new Bundle();
/* 22 */                    bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
/* 25 */                    return bundle2;
                    }
                }

/* 19 */        public C2527z9(AppCompatActivity appCompatActivity) {
                    this.f19992a = 0;
                    this.f19993b = appCompatActivity;
                }
            }
