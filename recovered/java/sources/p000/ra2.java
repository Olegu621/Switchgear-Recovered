            package p000;

            import android.R;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.graphics.Typeface;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.SparseArray;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.MenuItem;
            import androidx.viewpager2.widget.ViewPager2;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.play_billing.zzco;
            import io.flutter.Build;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterJNI;
            import java.io.File;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.regex.Matcher;
            import javax.inject.Provider;
            import kotlin.Unit;
            import kotlin.ranges.IntRange;
            import kotlin.text.MatchResult;
            import okio.Segment;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 209 */   public final class ra2 implements MatchResult, InterfaceC1013i2, sg0 {

                /* JADX INFO: renamed from: e */
                public static ra2 f15953e;

                /* JADX INFO: renamed from: f */
                public static final byte[] f15954f = new byte[0];

                /* JADX INFO: renamed from: a */
                public Object f15955a;

                /* JADX INFO: renamed from: b */
                public Object f15956b;

                /* JADX INFO: renamed from: c */
                public Object f15957c;

                /* JADX INFO: renamed from: d */
                public Object f15958d;

                public ra2(Typeface typeface, ni1 ni1Var) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 4 */             this.f15958d = typeface;
/* 6 */             this.f15955a = ni1Var;
/* 15 */            this.f15957c = new oi1(Segment.SHARE_MINIMUM);
/* 18 */            int iM8126a = ni1Var.m8126a(6);
/* 23 */            if (iM8126a != 0) {
/* 27 */                int i5 = iM8126a + ni1Var.f15962a;
/* 41 */                i = ((ByteBuffer) ni1Var.f15965d).getInt(((ByteBuffer) ni1Var.f15965d).getInt(i5) + i5);
                    } else {
/* 46 */                i = 0;
                    }
/* 51 */            this.f15956b = new char[i * 2];
/* 53 */            int iM8126a2 = ni1Var.m8126a(6);
/* 57 */            if (iM8126a2 != 0) {
/* 61 */                int i6 = iM8126a2 + ni1Var.f15962a;
/* 75 */                i2 = ((ByteBuffer) ni1Var.f15965d).getInt(((ByteBuffer) ni1Var.f15965d).getInt(i6) + i6);
                    } else {
/* 80 */                i2 = 0;
                    }
/* 82 */            for (int i7 = 0; i7 < i2; i7++) {
/* 86 */                qs2 qs2Var = new qs2(this, i7);
/* 89 */                mi1 mi1VarM8010b = qs2Var.m8010b();
/* 94 */                int iM8126a3 = mi1VarM8010b.m8126a(4);
/* 119 */               Character.toChars(iM8126a3 != 0 ? ((ByteBuffer) mi1VarM8010b.f15965d).getInt(iM8126a3 + mi1VarM8010b.f15962a) : 0, (char[]) this.f15956b, i7 * 2);
/* 122 */               mi1 mi1VarM8010b2 = qs2Var.m8010b();
/* 128 */               int iM8126a4 = mi1VarM8010b2.m8126a(16);
/* 132 */               if (iM8126a4 != 0) {
/* 136 */                   int i8 = iM8126a4 + mi1VarM8010b2.f15962a;
/* 150 */                   i3 = ((ByteBuffer) mi1VarM8010b2.f15965d).getInt(((ByteBuffer) mi1VarM8010b2.f15965d).getInt(i8) + i8);
                        } else {
/* 155 */                   i3 = 0;
                        }
/* 164 */               de3.m3023e("invalid metadata codepoint length", i3 > 0);
/* 169 */               oi1 oi1Var = (oi1) this.f15957c;
/* 171 */               mi1 mi1VarM8010b3 = qs2Var.m8010b();
/* 175 */               int iM8126a5 = mi1VarM8010b3.m8126a(16);
/* 179 */               if (iM8126a5 != 0) {
/* 183 */                   int i9 = iM8126a5 + mi1VarM8010b3.f15962a;
/* 197 */                   i4 = ((ByteBuffer) mi1VarM8010b3.f15965d).getInt(((ByteBuffer) mi1VarM8010b3.f15965d).getInt(i9) + i9);
                        } else {
/* 202 */                   i4 = 0;
                        }
/* 204 */               oi1Var.m7174a(qs2Var, 0, i4 - 1);
                    }
                }

                /* JADX INFO: renamed from: l */
                public static synchronized ra2 m8100l() {
                    try {
/* 6 */                 if (f15953e == null) {
/* 14 */                    f15953e = new ra2(0);
                        }
                    } catch (Throwable th) {
/* 24 */                throw th;
                    }
/* 19 */            return f15953e;
                }

                /* JADX INFO: renamed from: a */
                public C2485y4 m8101a() throws GeneralSecurityException {
                    fs0 fs0Var;
/* 3 */             C0868e5 c0868e5 = (C0868e5) this.f15955a;
/* 6 */             if (c0868e5 == null) {
/* 188 */               ds0.m3203t("Cannot build without parameters");
/* 5 */                 return null;
                    }
/* 10 */            fs0 fs0Var2 = (fs0) this.f15956b;
/* 12 */            if (fs0Var2 == null || (fs0Var = (fs0) this.f15957c) == null) {
/* 182 */               ds0.m3203t("Cannot build without key material");
/* 5 */                 return null;
                    }
/* 29 */            if (c0868e5.f7504r != ((C2335wl) fs0Var2.f8339b).f18678a.length) {
/* 176 */               ds0.m3203t("AES key size mismatch");
/* 5 */                 return null;
                    }
/* 40 */            if (c0868e5.f7505s != ((C2335wl) fs0Var.f8339b).f18678a.length) {
/* 170 */               ds0.m3203t("HMAC key size mismatch");
/* 5 */                 return null;
                    }
/* 42 */            C0832d5 c0832d5 = c0868e5.f7507u;
/* 44 */            C0832d5 c0832d6 = C0832d5.f6989e;
/* 46 */            if (c0832d5 != c0832d6 && ((Integer) this.f15958d) == null) {
/* 57 */                ds0.m3203t("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 61 */            if (c0832d5 == c0832d6 && ((Integer) this.f15958d) != null) {
/* 164 */               ds0.m3203t("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 71 */            if (c0832d5 == c0832d6) {
/* 75 */                C2335wl.m9584a(new byte[0]);
                    } else if (c0832d5 == C0832d5.f6988d) {
/* 108 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f15958d).intValue()).array());
                    } else {
/* 114 */               if (c0832d5 != C0832d5.f6987c) {
/* 158 */                   ds0.m3206w(((C0868e5) this.f15955a).f7507u, "Unknown AesCtrHmacAeadParameters.Variant: ");
/* 5 */                     return null;
                        }
/* 141 */               C2335wl.m9584a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f15958d).intValue()).array());
                    }
/* 146 */           return new C2485y4();
                }

                /* JADX INFO: renamed from: b */
                public C1029ij m8102b() {
/* 3 */             ArrayList arrayList = (ArrayList) this.f15957c;
/* 5 */             boolean z = true;
/* 17 */            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
/* 20 */            ArrayList arrayList2 = (ArrayList) this.f15956b;
/* 32 */            boolean z3 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
/* 34 */            if (!z2 && !z3) {
/* 41 */                C1951n4.m6859j("Details of the products must be provided.");
/* 33 */                return null;
                    }
/* 45 */            if (z2 && z3) {
/* 52 */                C1951n4.m6859j("Set SkuDetails or ProductDetailsParams, not both.");
/* 33 */                return null;
                    }
/* 58 */            if (!z2) {
/* 225 */               ((ArrayList) this.f15956b).forEach(new ve3());
                    } else {
/* 68 */                if (((ArrayList) this.f15957c).contains(null)) {
/* 212 */                   C1951n4.m6859j("SKU cannot be null.");
/* 33 */                    return null;
                        }
/* 78 */                if (((ArrayList) this.f15957c).size() > 1) {
/* 88 */                    ve2 ve2Var = (ve2) ((ArrayList) this.f15957c).get(0);
/* 90 */                    String strM9260b = ve2Var.m9260b();
/* 96 */                    ArrayList arrayList3 = (ArrayList) this.f15957c;
/* 98 */                    int size = arrayList3.size();
/* 105 */                   for (int i = 0; i < size; i++) {
/* 111 */                       ve2 ve2Var2 = (ve2) arrayList3.get(i);
/* 117 */                       if (!strM9260b.equals("play_pass_subs") && !ve2Var2.m9260b().equals("play_pass_subs") && !strM9260b.equals(ve2Var2.m9260b())) {
/* 142 */                           C1951n4.m6859j("SKUs should have the same type.");
/* 33 */                            return null;
                                }
                            }
/* 151 */                   String strOptString = ve2Var.f18024b.optString("packageName");
/* 157 */                   ArrayList arrayList4 = (ArrayList) this.f15957c;
/* 159 */                   int size2 = arrayList4.size();
/* 164 */                   for (int i2 = 0; i2 < size2; i2++) {
/* 170 */                       ve2 ve2Var3 = (ve2) arrayList4.get(i2);
/* 176 */                       if (!strM9260b.equals("play_pass_subs") && !ve2Var3.m9260b().equals("play_pass_subs") && !strOptString.equals(ve2Var3.f18024b.optString("packageName"))) {
/* 203 */                           C1951n4.m6859j("All SKUs must have the same package name.");
/* 33 */                            return null;
                                }
                            }
                        }
                    }
/* 230 */           C1029ij c1029ij = new C1029ij();
/* 288 */           c1029ij.f9628a = (z2 && !((ve2) ((ArrayList) this.f15957c).get(0)).f18024b.optString("packageName").isEmpty()) || (z3 && !((C0993hj) ((ArrayList) this.f15956b).get(0)).f9095a.f20366b.optString("packageName").isEmpty());
/* 294 */           c1029ij.f9630c = (String) this.f15955a;
/* 300 */           ((dc0) this.f15958d).getClass();
/* 307 */           if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
/* 316 */               z = false;
                    }
/* 317 */           boolean zIsEmpty = TextUtils.isEmpty(null);
/* 321 */           if (z && !zIsEmpty) {
/* 328 */               C1951n4.m6859j("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
/* 33 */                return null;
                    }
/* 339 */           c1029ij.f9631d = new xt0(19);
/* 343 */           ArrayList arrayList5 = (ArrayList) this.f15957c;
/* 358 */           c1029ij.f9629b = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
/* 362 */           ArrayList arrayList6 = (ArrayList) this.f15956b;
/* 375 */           c1029ij.f9632e = arrayList6 != null ? zzco.zzk(arrayList6) : zzco.zzl();
/* 377 */           return c1029ij;
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: c */
                public boolean mo1582c(AbstractC1778j2 abstractC1778j2, MenuItem menuItem) {
/* 20 */            return ((ActionMode.Callback) this.f15955a).onActionItemClicked(m8107k(abstractC1778j2), new wg1((Context) this.f15956b, (zi2) menuItem));
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: d */
                public void mo1583d(AbstractC1778j2 abstractC1778j2) {
/* 9 */             ((ActionMode.Callback) this.f15955a).onDestroyActionMode(m8107k(abstractC1778j2));
                }

                /* JADX INFO: renamed from: e */
                public qu0 m8103e() {
/* 3 */             Integer num = (Integer) this.f15955a;
/* 6 */             if (num == null) {
/* 266 */               ds0.m3203t("key size is not set");
/* 5 */                 return null;
                    }
/* 12 */            if (((Integer) this.f15956b) == null) {
/* 260 */               ds0.m3203t("tag size is not set");
/* 5 */                 return null;
                    }
/* 18 */            if (((C0832d5) this.f15957c) == null) {
/* 254 */               ds0.m3203t("hash type is not set");
/* 5 */                 return null;
                    }
/* 24 */            if (((C2131r4) this.f15958d) == null) {
/* 248 */               ds0.m3203t("variant is not set");
/* 5 */                 return null;
                    }
/* 32 */            if (num.intValue() < 16) {
/* 245 */               throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f15955a));
                    }
/* 36 */            Integer num2 = (Integer) this.f15956b;
/* 38 */            int iIntValue = num2.intValue();
/* 44 */            C0832d5 c0832d5 = (C0832d5) this.f15957c;
/* 48 */            if (iIntValue < 10) {
/* 225 */               throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                    }
/* 52 */            if (c0832d5 == C0832d5.f6982V) {
/* 56 */                if (iIntValue > 20) {
/* 74 */                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                        }
                    } else if (c0832d5 == C0832d5.f6983W) {
/* 81 */                if (iIntValue > 28) {
/* 99 */                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                        }
                    } else if (c0832d5 == C0832d5.f6984X) {
/* 106 */               if (iIntValue > 32) {
/* 124 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                        }
                    } else if (c0832d5 == C0832d5.f6985Y) {
/* 131 */               if (iIntValue > 48) {
/* 149 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                        }
                    } else {
/* 152 */               if (c0832d5 != C0832d5.f6986Z) {
/* 206 */                   ds0.m3203t("unknown hash type; must be SHA256, SHA384 or SHA512");
/* 5 */                     return null;
                        }
/* 156 */               if (iIntValue > 64) {
/* 203 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                        }
                    }
/* 184 */           return new qu0(((Integer) this.f15955a).intValue(), ((Integer) this.f15956b).intValue(), (C2131r4) this.f15958d, (C0832d5) this.f15957c);
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: f */
                public boolean mo1585f(AbstractC1778j2 abstractC1778j2, Menu menu) {
/* 3 */             ActionMode.Callback callback = (ActionMode.Callback) this.f15955a;
/* 5 */             ui2 ui2VarM8107k = m8107k(abstractC1778j2);
/* 11 */            le2 le2Var = (le2) this.f15958d;
/* 18 */            Menu ih1Var = (Menu) le2Var.getOrDefault(menu, null);
/* 20 */            if (ih1Var == null) {
/* 31 */                ih1Var = new ih1((Context) this.f15956b, (jg1) menu);
/* 34 */                le2Var.put(menu, ih1Var);
                    }
/* 37 */            return callback.onCreateActionMode(ui2VarM8107k, ih1Var);
                }

                /* JADX INFO: renamed from: g */
                public void m8104g() {
/* 1 */             pg3.m7423a();
/* 6 */             C0210cb c0210cb = (C0210cb) this.f15956b;
/* 8 */             c0210cb.getClass();
/* 11 */            pg3.m7423a();
/* 16 */            C1791jf c1791jf = (C1791jf) c0210cb.f2805c;
/* 18 */            Objects.requireNonNull(c1791jf);
/* 23 */            C1767ir c1767ir = (C1767ir) c0210cb.f2804b;
/* 25 */            Objects.requireNonNull(c1767ir);
/* 28 */            uw0 uw0Var = c1791jf.f12240a;
/* 30 */            Objects.requireNonNull(uw0Var);
/* 33 */            uw0Var.mo2951a();
/* 36 */            uw0 uw0Var2 = c1791jf.f12240a;
/* 38 */            Objects.requireNonNull(uw0Var2);
/* 57 */            w11.m9453w(uw0Var2.f7030e).mo3676a(new RunnableC1900lr(c1767ir, 0), pg3.m7436o());
/* 60 */            uw0 uw0Var3 = c1791jf.f12241b;
/* 62 */            if (uw0Var3 != null) {
/* 64 */                uw0Var3.mo2951a();
/* 86 */                w11.m9453w(c1791jf.f12241b.f7030e).mo3676a(new RunnableC1900lr(null, 1), pg3.m7436o());
                    }
/* 93 */            ((C1822k8) this.f15957c).getClass();
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 43 */            return new ra2((Executor) ((Provider) this.f15955a).get(), (s52) ((Provider) this.f15956b).get(), (C0875ec) ((ac1) this.f15957c).get(), (s52) ((Provider) this.f15958d).get());
                }

                @Override // p000.InterfaceC1013i2
                /* JADX INFO: renamed from: h */
                public boolean mo1587h(AbstractC1778j2 abstractC1778j2, Menu menu) {
/* 3 */             ActionMode.Callback callback = (ActionMode.Callback) this.f15955a;
/* 5 */             ui2 ui2VarM8107k = m8107k(abstractC1778j2);
/* 11 */            le2 le2Var = (le2) this.f15958d;
/* 18 */            Menu ih1Var = (Menu) le2Var.getOrDefault(menu, null);
/* 20 */            if (ih1Var == null) {
/* 31 */                ih1Var = new ih1((Context) this.f15956b, (jg1) menu);
/* 34 */                le2Var.put(menu, ih1Var);
                    }
/* 37 */            return callback.onPrepareActionMode(ui2VarM8107k, ih1Var);
                }

                /* JADX INFO: renamed from: i */
                public void m8105i(Object obj, ArrayList arrayList, HashSet hashSet) {
/* 5 */             if (arrayList.contains(obj)) {
/* 7 */                 return;
                    }
/* 12 */            if (hashSet.contains(obj)) {
/* 56 */                f42.m3663s("This graph contains cyclic dependencies");
/* 59 */                return;
                    }
/* 14 */            hashSet.add(obj);
/* 26 */            ArrayList arrayList2 = (ArrayList) ((le2) this.f15956b).getOrDefault(obj, null);
/* 28 */            if (arrayList2 != null) {
/* 30 */                int size = arrayList2.size();
/* 35 */                for (int i = 0; i < size; i++) {
/* 41 */                    m8105i(arrayList2.get(i), arrayList, hashSet);
                        }
                    }
/* 47 */            hashSet.remove(obj);
/* 50 */            arrayList.add(obj);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
                
                    if (r8 == r2) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
                
                    if (r8 == r2) goto L27;
                 */
                /* JADX INFO: renamed from: j */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object m8106j(d10 d10Var) {
                    i40 i40Var;
                    x30 x30Var;
/* 3 */             b50 b50Var = (b50) this.f15958d;
/* 7 */             if (d10Var instanceof i40) {
/* 10 */                i40Var = (i40) d10Var;
/* 12 */                int i = i40Var.f9443d;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    i40Var.f9443d = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    i40Var = new i40(this, d10Var);
                        }
                    } else {
/* 26 */                i40Var = new i40(this, d10Var);
                    }
/* 29 */            Object objM1284f = i40Var.f9441b;
/* 31 */            z10 z10Var = z10.f19902a;
/* 33 */            int i2 = i40Var.f9443d;
/* 38 */            if (i2 == 0) {
/* 62 */                pg3.m7417A(objM1284f);
/* 67 */                List list = (List) this.f15957c;
/* 69 */                if (list == null || list.isEmpty()) {
/* 101 */                   i40Var.f9440a = this;
/* 103 */                   i40Var.f9443d = 1;
/* 106 */                   objM1284f = b50.m1284f(b50Var, false, i40Var);
                        } else {
/* 78 */                    qe2 qe2VarM1286g = b50Var.m1286g();
/* 84 */                    l40 l40Var = new l40(b50Var, this, null);
/* 87 */                    i40Var.f9440a = this;
/* 89 */                    i40Var.f9443d = 2;
/* 91 */                    objM1284f = qe2VarM1286g.m7783b(l40Var, i40Var);
                        }
/* 112 */               return z10Var;
                    }
/* 40 */            if (i2 == 1) {
/* 56 */                this = i40Var.f9440a;
/* 58 */                pg3.m7417A(objM1284f);
/* 113 */               x30Var = (x30) objM1284f;
                    } else {
/* 42 */                if (i2 != 2) {
/* 52 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 44 */                this = i40Var.f9440a;
/* 46 */                pg3.m7417A(objM1284f);
/* 98 */                x30Var = (x30) objM1284f;
                    }
/* 121 */           ((b50) this.f15958d).f2223h.m4003u(x30Var);
/* 124 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: k */
                public ui2 m8107k(AbstractC1778j2 abstractC1778j2) {
/* 3 */             ArrayList arrayList = (ArrayList) this.f15957c;
/* 5 */             int size = arrayList.size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 16 */                ui2 ui2Var = (ui2) arrayList.get(i);
/* 18 */                if (ui2Var != null && ui2Var.f17547b == abstractC1778j2) {
/* 24 */                    return ui2Var;
                        }
                    }
/* 34 */            ui2 ui2Var2 = new ui2((Context) this.f15956b, abstractC1778j2);
/* 37 */            arrayList.add(ui2Var2);
/* 40 */            return ui2Var2;
                }

                /* JADX INFO: renamed from: m */
                public List m8108m(byte[] bArr) {
/* 14 */            List list = (List) ((ConcurrentMap) this.f15955a).get(new mx1(bArr));
                    return list != null ? list : Collections.EMPTY_LIST;
                }

                /* JADX INFO: renamed from: n */
                public IntRange m8109n() {
/* 3 */             Matcher matcher = (Matcher) this.f15955a;
/* 13 */            return r02.m8048e(matcher.start(), matcher.end());
                }

                /* JADX INFO: renamed from: o */
                public File m8110o(Context context) {
/* 5 */             ((p62) this.f15956b).getClass();
/* 23 */            return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
                }

                /* JADX INFO: renamed from: p */
                public boolean m8111p(Context context) {
/* 5 */             if (((Boolean) this.f15957c) == null) {
/* 22 */                this.f15957c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
                    }
/* 28 */            ((Boolean) this.f15956b).booleanValue();
/* 35 */            return ((Boolean) this.f15957c).booleanValue();
                }

                /* JADX INFO: renamed from: q */
                public boolean m8112q(Context context) {
/* 5 */             if (((Boolean) this.f15956b) == null) {
/* 22 */                this.f15956b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
                    }
/* 28 */            ((Boolean) this.f15956b).booleanValue();
/* 35 */            return ((Boolean) this.f15956b).booleanValue();
                }

                /* JADX INFO: renamed from: r */
                public void m8113r(String str, Object... objArr) {
/* 3 */             String str2 = String.format(Locale.US, str, objArr);
/* 11 */            if (((s80) this.f15958d) != null) {
/* 3 */                 Log.m4583d(FlutterJNI.TAG, str2);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: s */
                public Object m8114s(d10 d10Var) throws Throwable {
                    o52 o52Var;
                    gl1 gl1Var;
                    dl1 dl1Var;
                    Throwable th;
                    dl1 dl1Var2;
                    ra2 ra2Var;
/* 3 */             if (d10Var instanceof o52) {
/* 6 */                 o52Var = (o52) d10Var;
/* 8 */                 int i = o52Var.f14634e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o52Var.f14634e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o52Var = new o52(this, d10Var);
                        }
                    } else {
/* 22 */                o52Var = new o52(this, d10Var);
                    }
/* 25 */            Object obj = o52Var.f14632c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = o52Var.f14634e;
                    try {
/* 34 */                if (i2 == 0) {
/* 67 */                    pg3.m7417A(obj);
/* 78 */                    if (((C1869kx) this.f15956b).isCompleted()) {
/* 80 */                        return Unit.f12910a;
                            }
/* 85 */                    gl1Var = (gl1) this.f15955a;
/* 87 */                    o52Var.f14630a = this;
/* 89 */                    o52Var.f14631b = gl1Var;
/* 91 */                    o52Var.f14634e = 1;
/* 97 */                    if (gl1Var.m3967d(o52Var) != z10Var) {
                            }
                            dl1Var = gl1Var;
/* 135 */                   return z10Var;
                        }
/* 36 */                if (i2 != 1) {
/* 38 */                    if (i2 != 2) {
/* 53 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 40 */                    dl1Var2 = o52Var.f14631b;
/* 42 */                    ra2Var = o52Var.f14630a;
                            try {
/* 44 */                        pg3.m7417A(obj);
                                dl1Var2 = dl1Var2;
/* 140 */                       C1869kx c1869kx = (C1869kx) ra2Var.f15956b;
/* 142 */                       Unit unit = Unit.f12910a;
/* 144 */                       c1869kx.m10238D(unit);
/* 149 */                       ((gl1) dl1Var2).m3970g(null);
/* 152 */                       return unit;
                            } catch (Throwable th2) {
/* 48 */                        th = th2;
/* 155 */                       ((gl1) dl1Var2).m3970g(null);
/* 158 */                       throw th;
                            }
                        }
/* 57 */                dl1 dl1Var3 = o52Var.f14631b;
/* 59 */                ra2 ra2Var2 = o52Var.f14630a;
/* 61 */                pg3.m7417A(obj);
/* 64 */                dl1Var = dl1Var3;
/* 65 */                this = ra2Var2;
                        dl1Var = gl1Var;
/* 108 */               if (((C1869kx) this.f15956b).isCompleted()) {
/* 110 */                   Unit unit2 = Unit.f12910a;
/* 114 */                   ((gl1) dl1Var).m3970g(null);
/* 117 */                   return unit2;
                        }
/* 123 */               o52Var.f14630a = this;
/* 125 */               o52Var.f14631b = dl1Var;
/* 127 */               o52Var.f14634e = 2;
/* 133 */               if (this.m8106j(o52Var) != z10Var) {
/* 136 */                   ra2Var = this;
/* 137 */                   dl1Var2 = dl1Var;
/* 140 */                   C1869kx c1869kx2 = (C1869kx) ra2Var.f15956b;
/* 142 */                   Unit unit3 = Unit.f12910a;
/* 144 */                   c1869kx2.m10238D(unit3);
/* 149 */                   ((gl1) dl1Var2).m3970g(null);
/* 152 */                   return unit3;
                        }
                        dl1Var = gl1Var;
/* 135 */               return z10Var;
                    } catch (Throwable th3) {
/* 119 */               dl1 dl1Var4 = dl1Var;
/* 120 */               th = th3;
/* 121 */               dl1Var2 = dl1Var4;
/* 155 */               ((gl1) dl1Var2).m3970g(null);
/* 158 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: t */
                public void m8115t(Runnable runnable) {
/* 13 */            ((fs0) this.f15956b).m3826w(new dp0(this, runnable, 13, false));
                }

                /* JADX INFO: renamed from: u */
                public void m8116u(Runnable runnable) {
/* 5 */             ((fs0) this.f15956b).m3826w(runnable);
                }

                /* JADX INFO: renamed from: v */
                public void m8117v(js0 js0Var) {
/* 3 */             js0 js0Var2 = new js0(js0Var);
                    synchronized (this.f15958d) {
/* 9 */                 m8116u(js0Var2);
                        synchronized (js0Var2.f12469c) {
/* 23 */                    while (!((AtomicBoolean) js0Var2.f12470d).get()) {
                                try {
/* 27 */                            js0Var2.f12469c.wait();
                                } catch (InterruptedException e) {
/* 38 */                            xe2.m9775m("NotifyingRunnable", "Exception in NotifyingRunnable", e);
/* 45 */                            Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: w */
                public void m8118w() {
                    int iMo955a;
/* 3 */             er0 er0Var = (er0) this.f15956b;
/* 7 */             ts0 ts0Var = (ts0) this.f15955a;
/* 11 */            ViewPager2 viewPager2 = (ViewPager2) this.f15958d;
/* 13 */            int i = R.id.accessibilityActionPageLeft;
/* 16 */            e33.m3315k(R.id.accessibilityActionPageLeft, viewPager2);
/* 20 */            e33.m3311g(0, viewPager2);
/* 26 */            e33.m3315k(R.id.accessibilityActionPageRight, viewPager2);
/* 29 */            e33.m3311g(0, viewPager2);
/* 35 */            e33.m3315k(R.id.accessibilityActionPageUp, viewPager2);
/* 38 */            e33.m3311g(0, viewPager2);
/* 44 */            e33.m3315k(R.id.accessibilityActionPageDown, viewPager2);
/* 47 */            e33.m3311g(0, viewPager2);
/* 54 */            if (viewPager2.getAdapter() == null || (iMo955a = viewPager2.getAdapter().mo955a()) == 0 || !viewPager2.f2021f0) {
/* 148 */               return;
                    }
/* 78 */            if (viewPager2.getOrientation() != 0) {
/* 126 */               if (viewPager2.f2016d < iMo955a - 1) {
/* 133 */                   e33.m3316l(viewPager2, new C2518z0(R.id.accessibilityActionPageDown), ts0Var);
                        }
/* 138 */               if (viewPager2.f2016d > 0) {
/* 145 */                   e33.m3316l(viewPager2, new C2518z0(R.id.accessibilityActionPageUp), er0Var);
/* 148 */                   return;
                        }
/* 148 */               return;
                    }
/* 86 */            boolean z = viewPager2.f2024i.m989N() == 1;
/* 93 */            int i2 = z ? 16908360 : 16908361;
/* 94 */            if (z) {
/* 96 */                i = 16908361;
                    }
/* 100 */           if (viewPager2.f2016d < iMo955a - 1) {
/* 107 */               e33.m3316l(viewPager2, new C2518z0(i2), ts0Var);
                    }
/* 112 */           if (viewPager2.f2016d > 0) {
/* 119 */               e33.m3316l(viewPager2, new C2518z0(i), er0Var);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
                /* JADX INFO: renamed from: x */
                public Bundle m8119x() {
/* 3 */             ki3 ki3Var = (ki3) this.f15958d;
/* 9 */             if (((Bundle) this.f15957c) == null) {
/* 15 */                String str = (String) this.f15955a;
/* 17 */                SharedPreferences sharedPreferencesM6113D = ki3Var.m6113D();
/* 23 */                ij3 ij3Var = (ij3) ki3Var.f16749a;
/* 26 */                String string = sharedPreferencesM6113D.getString(str, null);
/* 30 */                if (string != null) {
                            try {
/* 34 */                        Bundle bundle = new Bundle();
/* 39 */                        JSONArray jSONArray = new JSONArray(string);
/* 48 */                        for (int i = 0; i < jSONArray.length(); i++) {
                                    try {
/* 50 */                                JSONObject jSONObject = jSONArray.getJSONObject(i);
/* 56 */                                String string2 = jSONObject.getString("n");
/* 62 */                                String string3 = jSONObject.getString("t");
/* 66 */                                int iHashCode = string3.hashCode();
/* 74 */                                if (iHashCode != 100) {
/* 78 */                                    if (iHashCode != 108) {
/* 82 */                                        if (iHashCode != 115) {
/* 86 */                                            if (iHashCode != 3352) {
/* 90 */                                                if (iHashCode == 3445 && string3.equals("la")) {
/* 102 */                                                   zzql.zza();
/* 113 */                                                   if (ij3Var.f9651d.m7406J(null, vg3.f18096Q0)) {
/* 121 */                                                       JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
/* 124 */                                                       int length = jSONArray2.length();
/* 128 */                                                       long[] jArr = new long[length];
/* 131 */                                                       for (int i2 = 0; i2 < length; i2++) {
/* 137 */                                                           jArr[i2] = jSONArray2.optLong(i2);
                                                                }
/* 142 */                                                       bundle.putLongArray(string2, jArr);
                                                            }
                                                        } else {
/* 255 */                                                   uh3 uh3Var = ij3Var.f9655f;
/* 257 */                                                   ij3.m4555l(uh3Var);
/* 264 */                                                   uh3Var.f17538f.m8511b(string3, "Unrecognized persisted bundle type. Type");
                                                        }
                                                    } else if (string3.equals("ia")) {
/* 155 */                                               zzql.zza();
/* 166 */                                               if (ij3Var.f9651d.m7406J(null, vg3.f18096Q0)) {
/* 174 */                                                   JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
/* 177 */                                                   int length2 = jSONArray3.length();
/* 181 */                                                   int[] iArr = new int[length2];
/* 184 */                                                   for (int i3 = 0; i3 < length2; i3++) {
/* 190 */                                                       iArr[i3] = jSONArray3.optInt(i3);
                                                            }
/* 195 */                                                   bundle.putIntArray(string2, iArr);
                                                        }
                                                    } else {
/* 255 */                                               uh3 uh3Var2 = ij3Var.f9655f;
/* 257 */                                               ij3.m4555l(uh3Var2);
/* 264 */                                               uh3Var2.f17538f.m8511b(string3, "Unrecognized persisted bundle type. Type");
                                                    }
                                                } else if (string3.equals("s")) {
/* 211 */                                           bundle.putString(string2, jSONObject.getString("v"));
                                                } else {
/* 255 */                                           uh3 uh3Var3 = ij3Var.f9655f;
/* 257 */                                           ij3.m4555l(uh3Var3);
/* 264 */                                           uh3Var3.f17538f.m8511b(string3, "Unrecognized persisted bundle type. Type");
                                                }
                                            } else if (string3.equals("l")) {
/* 231 */                                       bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                            } else {
/* 255 */                                       uh3 uh3Var4 = ij3Var.f9655f;
/* 257 */                                       ij3.m4555l(uh3Var4);
/* 264 */                                       uh3Var4.f17538f.m8511b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("d")) {
/* 251 */                                   bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                        } else {
/* 255 */                                   uh3 uh3Var5 = ij3Var.f9655f;
/* 257 */                                   ij3.m4555l(uh3Var5);
/* 264 */                                   uh3Var5.f17538f.m8511b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } catch (NumberFormatException | JSONException unused) {
/* 268 */                               uh3 uh3Var6 = ij3Var.f9655f;
/* 270 */                               ij3.m4555l(uh3Var6);
/* 277 */                               uh3Var6.f17538f.m8510a("Error reading value from SharedPreferences. Value dropped");
                                    }
                                }
/* 284 */                       this.f15957c = bundle;
                            } catch (JSONException unused2) {
/* 287 */                       uh3 uh3Var7 = ij3Var.f9655f;
/* 289 */                       ij3.m4555l(uh3Var7);
/* 296 */                       uh3Var7.f17538f.m8510a("Error loading bundle from SharedPreferences. Values will be lost");
                            }
                        }
/* 303 */               if (((Bundle) this.f15957c) == null) {
/* 309 */                   this.f15957c = (Bundle) this.f15956b;
                        }
                    }
/* 315 */           Bundle bundle2 = (Bundle) this.f15957c;
/* 317 */           kb1.m6061n(bundle2);
/* 320 */           return new Bundle(bundle2);
                }

                /* JADX INFO: renamed from: y */
                public void m8120y(Bundle bundle) {
                    Iterator<String> it;
/* 7 */             ki3 ki3Var = (ki3) this.f15958d;
/* 20 */            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
/* 27 */            SharedPreferences.Editor editorEdit = ki3Var.m6113D().edit();
/* 31 */            int size = bundle2.size();
/* 37 */            String str = (String) this.f15955a;
/* 39 */            if (size == 0) {
/* 41 */                editorEdit.remove(str);
                    } else {
/* 48 */                JSONArray jSONArray = new JSONArray();
/* 55 */                Iterator<String> it2 = bundle2.keySet().iterator();
/* 63 */                while (it2.hasNext()) {
/* 65 */                    String next = it2.next();
/* 71 */                    Object obj = bundle2.get(next);
/* 75 */                    if (obj != null) {
                                try {
/* 79 */                            JSONObject jSONObject = new JSONObject();
/* 84 */                            jSONObject.put("n", next);
/* 87 */                            zzql.zza();
/* 92 */                            ij3 ij3Var = (ij3) ki3Var.f16749a;
/* 113 */                           it = it2;
/* 117 */                           if (ij3Var.f9651d.m7406J(null, vg3.f18096Q0)) {
                                        try {
/* 121 */                                   if (obj instanceof String) {
/* 127 */                                       jSONObject.put("v", obj.toString());
/* 130 */                                       jSONObject.put("t", "s");
                                            } else if (obj instanceof Long) {
/* 146 */                                       jSONObject.put("v", obj.toString());
/* 149 */                                       jSONObject.put("t", "l");
                                            } else if (obj instanceof int[]) {
/* 163 */                                       jSONObject.put("v", Arrays.toString((int[]) obj));
/* 168 */                                       jSONObject.put("t", "ia");
                                            } else if (obj instanceof long[]) {
/* 182 */                                       jSONObject.put("v", Arrays.toString((long[]) obj));
/* 187 */                                       jSONObject.put("t", "la");
                                            } else if (obj instanceof Double) {
/* 199 */                                       jSONObject.put("v", obj.toString());
/* 202 */                                       jSONObject.put("t", "d");
                                            } else {
/* 206 */                                       uh3 uh3Var = ij3Var.f9655f;
/* 208 */                                       ij3.m4555l(uh3Var);
/* 217 */                                       uh3Var.f17538f.m8511b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                            }
/* 254 */                                   jSONArray.put(jSONObject);
                                        } catch (JSONException e) {
/* 135 */                                   e = e;
/* 280 */                                   uh3 uh3Var2 = ((ij3) ki3Var.f16749a).f9655f;
/* 282 */                                   ij3.m4555l(uh3Var2);
/* 289 */                                   uh3Var2.f17538f.m8511b(e, "Cannot serialize bundle value to SharedPreferences");
                                        }
                                    } else {
/* 228 */                               jSONObject.put("v", obj.toString());
/* 233 */                               if (obj instanceof String) {
/* 235 */                                   jSONObject.put("t", "s");
                                        } else if (obj instanceof Long) {
/* 243 */                                   jSONObject.put("t", "l");
                                        } else if (obj instanceof Double) {
/* 251 */                                   jSONObject.put("t", "d");
                                        } else {
/* 258 */                                   uh3 uh3Var3 = ij3Var.f9655f;
/* 260 */                                   ij3.m4555l(uh3Var3);
/* 269 */                                   uh3Var3.f17538f.m8511b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                        }
/* 254 */                               jSONArray.put(jSONObject);
                                    }
                                } catch (JSONException e2) {
/* 273 */                           e = e2;
/* 274 */                           it = it2;
                                }
/* 220 */                       it2 = it;
                            }
                        }
/* 297 */               editorEdit.putString(str, jSONArray.toString());
                    }
/* 300 */           editorEdit.apply();
/* 303 */           this.f15957c = bundle2;
                }

/* 210 */       public ra2(ki3 ki3Var, String str) {
                    this.f15958d = ki3Var;
/* 212 */           kb1.m6058k(str);
                    this.f15955a = str;
/* 213 */           this.f15956b = new Bundle();
                }

/* 213 */       public ra2(va1 va1Var) {
/* 215 */           this.f15955a = va1Var;
/* 216 */           this.f15956b = f15954f;
/* 217 */           this.f15957c = new int[32];
                }

/* 217 */       public ra2(ha2 ha2Var) {
/* 221 */           this.f15955a = new HashMap(ha2Var.f8986a);
/* 224 */           this.f15956b = new HashMap(ha2Var.f8987b);
/* 227 */           this.f15957c = new HashMap(ha2Var.f8988c);
/* 230 */           this.f15958d = new HashMap(ha2Var.f8989d);
                }

/* 230 */       public /* synthetic */ ra2(Object obj, Object obj2, Object obj3, Object obj4) {
/* 231 */           this.f15955a = obj;
                    this.f15956b = obj2;
                    this.f15957c = obj3;
                    this.f15958d = obj4;
                }

/* 231 */       public ra2(List list, List list2, List list3, List list4) {
                    list.getClass();
                    list2.getClass();
                    list3.getClass();
                    list4.getClass();
/* 233 */           this.f15955a = list;
/* 234 */           this.f15956b = list2;
/* 235 */           this.f15957c = list3;
/* 236 */           this.f15958d = list4;
                }

/* 236 */       public ra2(int i) {
                    switch (i) {
                        case 7:
/* 265 */                   this.f15955a = new nt1(10);
/* 266 */                   this.f15956b = new le2();
/* 267 */                   this.f15957c = new ArrayList();
/* 268 */                   this.f15958d = new HashSet();
                            break;
                        case 18:
/* 257 */                   p62 p62Var = new p62(4);
/* 259 */                   dc0 dc0Var = new dc0(17);
/* 261 */                   this.f15955a = new HashSet();
/* 262 */                   this.f15956b = p62Var;
/* 263 */                   this.f15957c = dc0Var;
                            break;
                        case 19:
/* 252 */                   this.f15955a = new HashMap();
/* 253 */                   this.f15956b = new HashMap();
/* 254 */                   this.f15957c = new HashMap();
/* 255 */                   this.f15958d = new HashMap();
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 245 */                   this.f15955a = new C1024id();
/* 246 */                   this.f15956b = new SparseArray();
/* 247 */                   this.f15957c = new ta1();
/* 250 */                   this.f15958d = new C1024id();
                            break;
                        default:
/* 238 */                   this.f15955a = null;
/* 239 */                   this.f15956b = null;
/* 240 */                   this.f15957c = null;
/* 241 */                   this.f15958d = new ArrayDeque();
                            break;
                    }
                }

/* 268 */       public ra2(Matcher matcher, CharSequence charSequence) {
                    matcher.getClass();
                    charSequence.getClass();
                    this.f15955a = matcher;
                    this.f15956b = charSequence;
/* 270 */           this.f15957c = new sc1(this);
                }
            }
