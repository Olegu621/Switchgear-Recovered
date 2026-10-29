            package p000;

            import android.text.TextUtils;
            import java.lang.ref.WeakReference;
            import java.util.ArrayDeque;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gq2 {

                /* JADX INFO: renamed from: b */
                public static WeakReference f8782b;

                /* JADX INFO: renamed from: a */
                public C0168b5 f8783a;

                /* JADX INFO: renamed from: a */
                public final synchronized fq2 m3987a() {
                    String str;
                    fq2 fq2Var;
/* 2 */             C0168b5 c0168b5 = this.f8783a;
                    synchronized (((ArrayDeque) c0168b5.f2214e)) {
/* 17 */                str = (String) ((ArrayDeque) c0168b5.f2214e).peek();
                    }
/* 20 */            Pattern pattern = fq2.f8319d;
/* 26 */            fq2Var = null;
/* 27 */            if (!TextUtils.isEmpty(str)) {
/* 33 */                String[] strArrSplit = str.split("!", -1);
/* 39 */                if (strArrSplit.length == 2) {
/* 50 */                    fq2Var = new fq2(strArrSplit[0], strArrSplit[1]);
                        }
                    }
/* 54 */            return fq2Var;
                }
            }
