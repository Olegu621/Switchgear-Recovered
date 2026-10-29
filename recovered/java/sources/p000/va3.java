            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.Looper;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.internal.auth.zzam;
            import com.google.android.gms.internal.auth.zzbe;
            import com.google.android.gms.internal.drive.zzaw;
            import com.google.android.gms.internal.location.zzaz;
            import com.google.android.gms.internal.p014authapi.zbo;
            import com.google.android.gms.internal.p015authapiphone.zzw;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 229 */   public final class va3 extends AbstractC2322w8 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17952a;

                public /* synthetic */ va3(int i) {
/* 1 */             this.f17952a = i;
                }

                @Override // p000.AbstractC2322w8
                public InterfaceC0836d9 buildClient(Context context, Looper looper, C2345wv c2345wv, Object obj, rr0 rr0Var, sr0 sr0Var) {
                    switch (this.f17952a) {
                        case 0:
/* 227 */                   return new ie2(context, looper, c2345wv, rr0Var, sr0Var, ie2.m4519b(c2345wv));
                        case 1:
/* 205 */                   obj.getClass();
/* 213 */                   throw new ClassCastException();
                        case 2:
                        case 5:
                        case 7:
                        default:
/* 7 */                     return super.buildClient(context, looper, c2345wv, obj, rr0Var, sr0Var);
                        case 3:
/* 201 */                   return new zbo(context, looper, c2345wv, (C0177be) obj, rr0Var, sr0Var);
                        case 4:
/* 187 */                   return new mc3(context, looper, c2345wv, (GoogleSignInOptions) obj, rr0Var, sr0Var);
                        case 6:
/* 93 */                    HashSet hashSet = new HashSet();
/* 98 */                    new HashSet();
/* 103 */                   C1024id c1024id = new C1024id();
/* 108 */                   C1024id c1024id2 = new C1024id();
/* 111 */                   Object obj2 = pr0.f15258c;
/* 113 */                   va3 va3Var = pb3.f15056a;
/* 117 */                   new ArrayList();
/* 122 */                   new ArrayList();
/* 125 */                   context.getMainLooper();
/* 128 */                   String packageName = context.getPackageName();
/* 136 */                   String name = context.getClass().getName();
/* 140 */                   C0983h9 c0983h9 = pb3.f15057b;
/* 173 */                   return new zzaz(context, looper, rr0Var, sr0Var, "activity_recognition", new C2345wv(null, hashSet, c1024id, packageName, name, c1024id2.containsKey(c0983h9) ? (je2) c1024id2.getOrDefault(c0983h9, null) : je2.f12239a));
                        case 8:
/* 83 */                    return new zzaz(context, looper, rr0Var, sr0Var, "locationServices", c2345wv);
                        case 9:
/* 68 */                    return new zzaw(context, looper, c2345wv, rr0Var, sr0Var, new Bundle());
                        case 10:
/* 34 */                    if (obj == null) {
/* 48 */                        return new zzaw(context, looper, c2345wv, rr0Var, sr0Var, new Bundle());
                            }
/* 52 */                    C1697u2.m5431g();
/* 3 */                     return null;
                        case 11:
/* 30 */                    return new zzam(context, looper, c2345wv, rr0Var, sr0Var);
                        case 12:
/* 12 */                    obj.getClass();
/* 20 */                    throw new ClassCastException();
                    }
                }

                @Override // p000.AbstractC0208c9
                public List getImpliedScopes(Object obj) {
                    switch (this.f17952a) {
                        case 4:
/* 11 */                    GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                            return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.f3387b);
                        default:
/* 6 */                     return super.getImpliedScopes(obj);
                    }
                }

                @Override // p000.AbstractC2322w8
/* 230 */       public /* synthetic */ InterfaceC0836d9 buildClient(Context context, Looper looper, C2345wv c2345wv, Object obj, InterfaceC2478xy interfaceC2478xy, wp1 wp1Var) {
                    switch (this.f17952a) {
                        case 2:
/* 236 */                   return new gc3(context, looper, c2345wv, (zm2) obj, interfaceC2478xy, wp1Var);
                        case 5:
/* 234 */                   return new zzbe(context, looper, c2345wv, (C0877ee) obj, interfaceC2478xy, wp1Var);
                        case 7:
/* 232 */                   return new zzw(context, looper, c2345wv, interfaceC2478xy, wp1Var);
                        default:
                            return super.buildClient(context, looper, c2345wv, obj, interfaceC2478xy, wp1Var);
                    }
                }
            }
