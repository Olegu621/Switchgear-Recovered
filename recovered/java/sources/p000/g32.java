            package p000;

            import android.app.RemoteInput;
            import android.os.Build;
            import android.os.Bundle;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g32 {

                /* JADX INFO: renamed from: a */
                public final String f8451a;

                /* JADX INFO: renamed from: b */
                public final CharSequence f8452b;

                /* JADX INFO: renamed from: c */
                public final CharSequence[] f8453c;

                /* JADX INFO: renamed from: d */
                public final boolean f8454d;

                /* JADX INFO: renamed from: e */
                public final int f8455e;

                /* JADX INFO: renamed from: f */
                public final Bundle f8456f;

                /* JADX INFO: renamed from: g */
                public final Set f8457g;

                public g32(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
/* 4 */             this.f8451a = str;
/* 6 */             this.f8452b = charSequence;
/* 8 */             this.f8453c = charSequenceArr;
/* 10 */            this.f8454d = z;
/* 12 */            this.f8455e = i;
/* 14 */            this.f8456f = bundle;
/* 16 */            this.f8457g = hashSet;
/* 19 */            if (i != 2 || z) {
/* 31 */                return;
                    }
/* 26 */            C1951n4.m6859j("setEditChoicesBeforeSending requires setAllowFreeFormInput");
/* 30 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public static RemoteInput m3868a(g32 g32Var) {
                    Set set;
/* 28 */            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(g32Var.f8451a).setLabel(g32Var.f8452b).setChoices(g32Var.f8453c).setAllowFreeFormInput(g32Var.f8454d).addExtras(g32Var.f8456f);
/* 36 */            if (Build.VERSION.SDK_INT >= 26 && (set = g32Var.f8457g) != null) {
/* 42 */                Iterator it = set.iterator();
/* 50 */                while (it.hasNext()) {
/* 59 */                    e32.m3304d(builderAddExtras, (String) it.next(), true);
                        }
                    }
/* 67 */            if (Build.VERSION.SDK_INT >= 29) {
/* 71 */                f32.m3646b(builderAddExtras, g32Var.f8455e);
                    }
/* 74 */            return builderAddExtras.build();
                }
            }
