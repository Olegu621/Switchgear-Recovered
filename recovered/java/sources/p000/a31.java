            package p000;

            import android.content.Context;
            import android.util.AttributeSet;
            import java.util.HashMap;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class a31 {

                /* JADX INFO: renamed from: a */
                public int f72a = -1;

                /* JADX INFO: renamed from: b */
                public int f73b = -1;

                /* JADX INFO: renamed from: c */
                public String f74c = null;

                /* JADX INFO: renamed from: d */
                public HashMap f75d;

                /* JADX INFO: renamed from: e */
                public static float m42e(Number number) {
                    return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
                }

                /* JADX INFO: renamed from: a */
                public abstract a31 mo43a();

                /* JADX INFO: renamed from: b */
                public abstract void mo44b(HashSet hashSet);

                /* JADX INFO: renamed from: c */
                public abstract void mo45c(Context context, AttributeSet attributeSet);

                /* JADX INFO: renamed from: d */
                public void mo46d(HashMap map) {
                }
            }
