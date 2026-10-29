            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.drawable.Drawable;
            import android.util.SparseArray;
            import android.util.Xml;
            import android.view.ContextThemeWrapper;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import android.widget.ListAdapter;
            import android.widget.TextView;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import androidx.constraintlayout.widget.R$styleable;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1706e;
            import io.sentry.vendor.gson.stream.C1732c;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import java.net.InetAddress;
            import java.net.URI;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Calendar;
            import java.util.Collection;
            import java.util.Currency;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicIntegerArray;
            import kotlin.Unit;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            import kotlinx.serialization.json.JsonNull;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: renamed from: n7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 175 */   public final class C1954n7 implements InterfaceC2091q1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14150a;

                /* JADX INFO: renamed from: b */
                public int f14151b;

                /* JADX INFO: renamed from: c */
                public Object f14152c;

                public C1954n7(Context context, XmlResourceParser xmlResourceParser) {
/* 2 */             this.f14150a = 7;
/* 8 */             this.f14151b = -1;
/* 15 */            this.f14152c = new SparseArray();
/* 19 */            new SparseArray();
/* 28 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.StateSet);
/* 32 */            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 37 */            for (int i = 0; i < indexCount; i++) {
/* 39 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 45 */                if (index == R$styleable.StateSet_defaultState) {
/* 53 */                    this.f14151b = typedArrayObtainStyledAttributes.getResourceId(index, this.f14151b);
                        }
                    }
/* 58 */            typedArrayObtainStyledAttributes.recycle();
                    try {
/* 61 */                int eventType = xmlResourceParser.getEventType();
/* 65 */                wg2 wg2Var = null;
/* 67 */                while (eventType != 1) {
/* 69 */                    if (eventType == 0) {
/* 159 */                       xmlResourceParser.getName();
                            } else if (eventType == 2) {
/* 91 */                        String name = xmlResourceParser.getName();
                                switch (name.hashCode()) {
                                    case 80204913:
/* 142 */                               if (name.equals("State")) {
/* 146 */                                   wg2Var = new wg2(context, xmlResourceParser);
/* 155 */                                   ((SparseArray) this.f14152c).put(wg2Var.f18617a, wg2Var);
                                        }
                                        break;
                                    case 1301459538:
/* 131 */                               name.equals("LayoutDescription");
                                        break;
                                    case 1382829617:
/* 124 */                               name.equals("StateSet");
                                        break;
                                    case 1901439077:
/* 109 */                               if (name.equals("Variant")) {
/* 113 */                                   xg2 xg2Var = new xg2(context, xmlResourceParser);
/* 116 */                                   if (wg2Var != null) {
/* 120 */                                       wg2Var.f18618b.add(xg2Var);
                                            }
                                        }
                                        break;
                                }
                            } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
/* 176 */                       return;
                            }
/* 162 */                   eventType = xmlResourceParser.next();
                        }
                    } catch (IOException e) {
/* 168 */               e.printStackTrace();
                    } catch (XmlPullParserException e2) {
/* 173 */               e2.printStackTrace();
                    }
                }

                /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
                /* JADX WARN: Code duplicated, block: B:31:0x00a4 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX INFO: renamed from: a */
                public static final Object m6896a(C1954n7 c1954n7, s50 s50Var, AbstractC0181bi abstractC0181bi) {
                    j21 j21Var;
                    byte bM6128f;
                    s50 s50Var2;
                    LinkedHashMap linkedHashMap;
                    C1954n7 c1954n8;
                    byte bM6127e;
                    C1837kn c1837kn;
/* 3 */             C1837kn c1837kn2 = (C1837kn) c1954n7.f14152c;
/* 7 */             if (abstractC0181bi instanceof j21) {
/* 10 */                j21Var = (j21) abstractC0181bi;
/* 12 */                int i = j21Var.f12032i;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    j21Var.f12032i = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    j21Var = new j21(c1954n7, abstractC0181bi);
                        }
                    } else {
/* 26 */                j21Var = new j21(c1954n7, abstractC0181bi);
                    }
/* 29 */            Object obj = j21Var.f12030e;
/* 31 */            z10 z10Var = z10.f19902a;
/* 33 */            int i2 = j21Var.f12032i;
/* 41 */            if (i2 != 0) {
/* 43 */                if (i2 != 1) {
/* 89 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 45 */                String str = j21Var.f12029d;
/* 47 */                linkedHashMap = j21Var.f12028c;
/* 49 */                c1954n8 = j21Var.f12027b;
/* 51 */                s50Var2 = j21Var.f12026a;
/* 53 */                pg3.m7417A(obj);
/* 58 */                linkedHashMap.put(str, (AbstractC1858b) obj);
/* 65 */                bM6127e = ((C1837kn) c1954n8.f14152c).m6127e();
/* 69 */                if (bM6127e == 4) {
/* 84 */                    bM6128f = bM6127e;
/* 85 */                    c1954n7 = c1954n8;
                        } else if (bM6127e != 7) {
/* 80 */                    C1837kn.m6122m((C1837kn) c1954n8.f14152c, "Expected end of the object or comma", 0, 6);
/* 83 */                    throw null;
                        }
/* 157 */               c1837kn = (C1837kn) c1954n8.f14152c;
/* 159 */               if (bM6127e == 6) {
/* 161 */                   c1837kn.m6128f((byte) 7);
                        } else if (bM6127e == 4) {
/* 175 */                   C1837kn.m6122m(c1837kn, "Unexpected trailing comma", 0, 6);
/* 178 */                   throw null;
                        }
/* 169 */               return new C1859c(linkedHashMap);
                    }
/* 93 */            pg3.m7417A(obj);
/* 96 */            bM6128f = c1837kn2.m6128f((byte) 6);
/* 104 */           if (c1837kn2.m6138q() == 4) {
/* 181 */               C1837kn.m6122m(c1837kn2, "Unexpected leading comma", 0, 6);
/* 184 */               throw null;
                    }
/* 111 */           s50Var2 = s50Var;
/* 108 */           linkedHashMap = new LinkedHashMap();
/* 115 */           C1837kn c1837kn3 = (C1837kn) c1954n7.f14152c;
/* 121 */           if (!c1837kn3.m6124b()) {
/* 153 */               c1954n8 = c1954n7;
/* 154 */               bM6127e = bM6128f;
/* 157 */               c1837kn = (C1837kn) c1954n8.f14152c;
/* 159 */               if (bM6127e == 6) {
/* 161 */                   c1837kn.m6128f((byte) 7);
                        } else if (bM6127e == 4) {
/* 175 */                   C1837kn.m6122m(c1837kn, "Unexpected trailing comma", 0, 6);
/* 178 */                   throw null;
                        }
/* 169 */               return new C1859c(linkedHashMap);
                    }
/* 123 */           String strM6131i = c1837kn3.m6131i();
/* 128 */           c1837kn3.m6128f((byte) 5);
/* 131 */           Unit unit = Unit.f12910a;
/* 133 */           j21Var.f12026a = s50Var2;
/* 135 */           j21Var.f12027b = c1954n7;
/* 137 */           j21Var.f12028c = linkedHashMap;
/* 139 */           j21Var.f12029d = strM6131i;
/* 141 */           j21Var.f12032i = 1;
/* 143 */           t50 t50Var = (t50) s50Var2;
/* 145 */           t50Var.getClass();
/* 148 */           t50Var.f16922c = j21Var;
/* 150 */           t50Var.f16921b = unit;
/* 152 */           return z10Var;
                }

                /* JADX INFO: renamed from: b */
                public DialogInterfaceC1991o7 m6897b() {
/* 5 */             C1783j7 c1783j7 = (C1783j7) this.f14152c;
/* 11 */            DialogInterfaceC1991o7 dialogInterfaceC1991o7 = new DialogInterfaceC1991o7(c1783j7.f12105a, this.f14151b);
/* 14 */            View view = c1783j7.f12109e;
/* 17 */            C1917m7 c1917m7 = dialogInterfaceC1991o7.f14655f;
/* 19 */            if (view != null) {
/* 21 */                c1917m7.f13635w = view;
                    } else {
/* 24 */                CharSequence charSequence = c1783j7.f12108d;
/* 26 */                if (charSequence != null) {
/* 28 */                    c1917m7.f13616d = charSequence;
/* 30 */                    TextView textView = c1917m7.f13633u;
/* 32 */                    if (textView != null) {
/* 34 */                        textView.setText(charSequence);
                            }
                        }
/* 37 */                Drawable drawable = c1783j7.f12107c;
/* 39 */                if (drawable != null) {
/* 41 */                    c1917m7.f13631s = drawable;
/* 43 */                    ImageView imageView = c1917m7.f13632t;
/* 45 */                    if (imageView != null) {
/* 47 */                        imageView.setVisibility(0);
/* 52 */                        c1917m7.f13632t.setImageDrawable(drawable);
                            }
                        }
                    }
/* 55 */            String str = c1783j7.f12110f;
/* 57 */            if (str != null) {
/* 59 */                c1917m7.f13617e = str;
/* 61 */                TextView textView2 = c1917m7.f13634v;
/* 63 */                if (textView2 != null) {
/* 65 */                    textView2.setText(str);
                        }
                    }
/* 68 */            CharSequence charSequence2 = c1783j7.f12111g;
/* 70 */            if (charSequence2 != null) {
/* 76 */                c1917m7.m6614c(-1, charSequence2, c1783j7.f12112h);
                    }
/* 79 */            CharSequence charSequence3 = c1783j7.f12113i;
/* 81 */            if (charSequence3 != null) {
/* 87 */                c1917m7.m6614c(-2, charSequence3, c1783j7.f12114j);
                    }
/* 93 */            if (c1783j7.f12119o != null) {
/* 104 */               AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1783j7.f12106b.inflate(c1917m7.f13607A, (ViewGroup) null);
/* 113 */               int i = c1783j7.f12122r ? c1917m7.f13608B : c1917m7.f13609C;
/* 115 */               ListAdapter c1880l7 = c1783j7.f12119o;
/* 117 */               if (c1880l7 == null) {
/* 127 */                   c1880l7 = new C1880l7(c1783j7.f12105a, i, R.id.text1, null);
                        }
/* 130 */               c1917m7.f13636x = c1880l7;
/* 134 */               c1917m7.f13637y = c1783j7.f12123s;
/* 138 */               if (c1783j7.f12120p != null) {
/* 145 */                   alertController$RecycleListView.setOnItemClickListener(new C1018i7(c1783j7, c1917m7));
                        }
/* 150 */               if (c1783j7.f12122r) {
/* 152 */                   alertController$RecycleListView.setChoiceMode(1);
                        }
/* 155 */               c1917m7.f13618f = alertController$RecycleListView;
                    }
/* 157 */           View view2 = c1783j7.f12121q;
/* 159 */           if (view2 != null) {
/* 161 */               c1917m7.f13619g = view2;
/* 163 */               c1917m7.f13620h = false;
                    }
/* 167 */           dialogInterfaceC1991o7.setCancelable(c1783j7.f12115k);
/* 172 */           if (c1783j7.f12115k) {
/* 174 */               dialogInterfaceC1991o7.setCanceledOnTouchOutside(true);
                    }
/* 179 */           dialogInterfaceC1991o7.setOnCancelListener(c1783j7.f12116l);
/* 184 */           dialogInterfaceC1991o7.setOnDismissListener(c1783j7.f12117m);
/* 187 */           kg1 kg1Var = c1783j7.f12118n;
/* 189 */           if (kg1Var != null) {
/* 191 */               dialogInterfaceC1991o7.setOnKeyListener(kg1Var);
                    }
/* 194 */           return dialogInterfaceC1991o7;
                }

                /* JADX INFO: renamed from: c */
                public void m6898c(int i, int i2) {
/* 1 */             int i3 = i2 + i;
/* 4 */             char[] cArr = (char[]) this.f14152c;
/* 7 */             if (cArr.length <= i3) {
/* 9 */                 int i4 = i * 2;
/* 11 */                if (i3 < i4) {
/* 13 */                    i3 = i4;
                        }
/* 18 */                this.f14152c = Arrays.copyOf(cArr, i3);
                    }
                }

                /* JADX INFO: renamed from: d */
                public HashMap m6899d(Map map, ILogger iLogger) {
/* 3 */             HashMap map2 = new HashMap();
/* 18 */            for (Object obj : map.keySet()) {
/* 24 */                Object obj2 = map.get(obj);
/* 28 */                if (obj2 != null) {
/* 38 */                    map2.put(obj.toString(), m6904i(iLogger, obj2));
                        } else {
/* 47 */                    map2.put(obj.toString(), null);
                        }
                    }
/* 51 */            return map2;
                }

                /* JADX INFO: renamed from: e */
                public AbstractC1858b m6900e() {
                    AbstractC1858b c1859c;
                    Object obj;
                    Object objMo4450a;
/* 3 */             C1837kn c1837kn = (C1837kn) this.f14152c;
/* 5 */             byte bM6138q = c1837kn.m6138q();
/* 10 */            if (bM6138q == 1) {
/* 12 */                return m6902g(true);
                    }
/* 18 */            if (bM6138q == 0) {
/* 20 */                return m6902g(false);
                    }
/* 27 */            if (bM6138q != 6) {
/* 241 */               if (bM6138q == 8) {
/* 243 */                   return m6901f();
                        }
/* 262 */               C1837kn.m6122m(c1837kn, "Cannot begin reading element, unexpected token: " + ((int) bM6138q), 0, 6);
/* 265 */               throw null;
                    }
/* 31 */            int i = this.f14151b + 1;
/* 32 */            this.f14151b = i;
/* 36 */            if (i == 200) {
/* 40 */                i21 i21Var = new i21(this, null);
/* 43 */                Unit unit = Unit.f12910a;
/* 45 */                z10 z10Var = r50.f15880a;
/* 49 */                t50 t50Var = new t50(null);
/* 52 */                t50Var.f16920a = i21Var;
/* 54 */                t50Var.f16921b = unit;
/* 56 */                t50Var.f16922c = t50Var;
/* 58 */                z10 z10Var2 = r50.f15880a;
/* 60 */                t50Var.f16923d = z10Var2;
                        while (true) {
/* 62 */                    obj = t50Var.f16923d;
/* 64 */                    c10 c10Var = t50Var.f16922c;
/* 66 */                    if (c10Var == null) {
                                break;
                            }
/* 75 */                    m42 m42Var = o42.f14612b;
/* 81 */                    if (Intrinsics.m6216a(z10Var2, obj)) {
                                try {
/* 83 */                            i21 i21Var2 = t50Var.f16920a;
/* 85 */                            Unit unit2 = t50Var.f16921b;
/* 88 */                            if (i21Var2 == null) {
/* 90 */                                i21Var2.getClass();
/* 93 */                                CoroutineContext context = c10Var.getContext();
/* 109 */                               Object kz0Var = context == C1846g.f12919a ? new kz0(c10Var) : new lz0(c10Var, context);
/* 113 */                               gs2.m4011b(3, i21Var2);
/* 116 */                               objMo4450a = i21Var2.mo4450a(t50Var, unit2, kz0Var);
                                    } else {
/* 121 */                               gs2.m4011b(3, i21Var2);
/* 124 */                               objMo4450a = i21Var2.mo4450a(t50Var, unit2, c10Var);
                                    }
/* 130 */                           if (objMo4450a != z10.f19902a) {
/* 132 */                               c10Var.resumeWith(objMo4450a);
                                    }
                                } catch (Throwable th) {
/* 137 */                           m42 m42Var2 = o42.f14612b;
/* 144 */                           c10Var.resumeWith(new n42(th));
                                }
                            } else {
/* 148 */                       t50Var.f16923d = z10Var2;
/* 150 */                       c10Var.resumeWith(obj);
                            }
                        }
/* 68 */                pg3.m7417A(obj);
/* 71 */                c1859c = (AbstractC1858b) obj;
                    } else {
/* 154 */               byte bM6128f = c1837kn.m6128f((byte) 6);
/* 163 */               if (c1837kn.m6138q() == 4) {
/* 235 */                   C1837kn.m6122m(c1837kn, "Unexpected leading comma", 0, 6);
/* 238 */                   throw null;
                        }
/* 167 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 175 */               while (c1837kn.m6124b()) {
/* 177 */                   String strM6131i = c1837kn.m6131i();
/* 182 */                   c1837kn.m6128f((byte) 5);
/* 189 */                   linkedHashMap.put(strM6131i, m6900e());
/* 192 */                   bM6128f = c1837kn.m6127e();
/* 196 */                   if (bM6128f != 4) {
/* 198 */                       if (bM6128f == 7) {
                                    break;
                                }
/* 203 */                       C1837kn.m6122m(c1837kn, "Expected end of the object or comma", 0, 6);
/* 206 */                       throw null;
                            }
                        }
/* 207 */               if (bM6128f == 6) {
/* 209 */                   c1837kn.m6128f((byte) 7);
                        } else if (bM6128f == 4) {
/* 229 */                   C1837kn.m6122m(c1837kn, "Unexpected trailing comma", 0, 6);
/* 232 */                   throw null;
                        }
/* 217 */               c1859c = new C1859c(linkedHashMap);
                    }
/* 224 */           this.f14151b--;
/* 226 */           return c1859c;
                }

                /* JADX INFO: renamed from: f */
                public C1857a m6901f() {
/* 3 */             C1837kn c1837kn = (C1837kn) this.f14152c;
/* 5 */             byte bM6127e = c1837kn.m6127e();
/* 17 */            if (c1837kn.m6138q() == 4) {
/* 85 */                C1837kn.m6122m(c1837kn, "Unexpected leading comma", 0, 6);
/* 88 */                throw null;
                    }
/* 21 */            ArrayList arrayList = new ArrayList();
/* 30 */            while (c1837kn.m6124b()) {
/* 36 */                arrayList.add(m6900e());
/* 39 */                bM6127e = c1837kn.m6127e();
/* 43 */                if (bM6127e != 4) {
/* 49 */                    boolean z = bM6127e == 9;
/* 50 */                    int i = c1837kn.f12882b;
/* 52 */                    if (!z) {
/* 57 */                        C1837kn.m6122m(c1837kn, "Expected end of the array or comma", i, 4);
/* 60 */                        throw null;
                            }
                        }
                    }
/* 63 */            if (bM6127e == 8) {
/* 65 */                c1837kn.m6128f((byte) 9);
                    } else if (bM6127e == 4) {
/* 79 */                C1837kn.m6122m(c1837kn, "Unexpected trailing comma", 0, 6);
/* 82 */                throw null;
                    }
/* 73 */            return new C1857a(arrayList);
                }

                /* JADX INFO: renamed from: g */
                public AbstractC1860d m6902g(boolean z) {
/* 3 */             C1837kn c1837kn = (C1837kn) this.f14152c;
/* 12 */            String strM6132j = !z ? c1837kn.m6132j() : c1837kn.m6131i();
                    return (z || !Intrinsics.m6216a(strM6132j, "null")) ? new s11(strM6132j, z) : JsonNull.f12961a;
                }

                /* JADX INFO: renamed from: h */
                public void m6903h() {
/* 1 */             C1003ht c1003ht = C1003ht.f9226a;
/* 5 */             char[] cArr = (char[]) this.f14152c;
/* 7 */             cArr.getClass();
                    synchronized (c1003ht) {
/* 11 */                int i = C1003ht.f9228c;
/* 17 */                if (cArr.length + i < C1003ht.f9229d) {
/* 21 */                    C1003ht.f9228c = i + cArr.length;
/* 25 */                    C1003ht.f9227b.addLast(cArr);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
                /* JADX INFO: renamed from: i */
                public Object m6904i(ILogger iLogger, Object obj) {
                    Object objM6908n;
/* 2 */             if (obj == null) {
/* 1 */                 return null;
                    }
/* 7 */             if (obj instanceof Character) {
/* 9 */                 return obj.toString();
                    }
/* 16 */            if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
/* 28 */                return obj;
                    }
/* 31 */            if (obj instanceof Locale) {
/* 33 */                return obj.toString();
                    }
/* 40 */            int i = 0;
/* 41 */            if (obj instanceof AtomicIntegerArray) {
/* 43 */                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
/* 45 */                Charset charset = AbstractC1706e.f11729a;
/* 47 */                int length = atomicIntegerArray.length();
/* 53 */                ArrayList arrayList = new ArrayList(length);
/* 56 */                while (i < length) {
/* 66 */                    arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
/* 69 */                    i++;
                        }
/* 72 */                return arrayList;
                    }
/* 75 */            if (obj instanceof AtomicBoolean) {
/* 83 */                return Boolean.valueOf(((AtomicBoolean) obj).get());
                    }
/* 90 */            if (obj instanceof URI) {
/* 92 */                return obj.toString();
                    }
/* 99 */            if (obj instanceof InetAddress) {
/* 101 */               return obj.toString();
                    }
/* 108 */           if (obj instanceof UUID) {
/* 110 */               return obj.toString();
                    }
/* 117 */           if (obj instanceof Currency) {
/* 119 */               return obj.toString();
                    }
/* 126 */           if (obj instanceof Calendar) {
/* 130 */               return AbstractC1706e.m5470b((Calendar) obj);
                    }
/* 143 */           if (obj.getClass().isEnum()) {
/* 145 */               return obj.toString();
                    }
/* 154 */           if (((HashSet) this.f14152c) == null) {
/* 161 */               this.f14152c = new HashSet();
                    }
/* 165 */           HashSet hashSet = (HashSet) this.f14152c;
/* 171 */           if (hashSet.contains(obj)) {
/* 179 */               iLogger.mo4672k(EnumC1553m5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
/* 182 */               return obj.toString();
                    }
/* 187 */           hashSet.add(obj);
                    try {
/* 196 */               if (hashSet.size() > this.f14151b) {
/* 198 */                   hashSet.remove(obj);
/* 207 */                   iLogger.mo4672k(EnumC1553m5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
/* 210 */                   return obj.toString();
                        }
                        try {
/* 223 */                   if (obj.getClass().isArray()) {
/* 226 */                       Object[] objArr = (Object[]) obj;
/* 230 */                       objM6908n = new ArrayList();
/* 233 */                       int length2 = objArr.length;
/* 234 */                       while (i < length2) {
/* 242 */                           objM6908n.add(m6904i(iLogger, objArr[i]));
/* 245 */                           i++;
                                }
                            } else if (obj instanceof Collection) {
/* 261 */                       objM6908n = new ArrayList();
/* 264 */                       Iterator it = ((Collection) obj).iterator();
/* 272 */                       while (it.hasNext()) {
/* 282 */                           objM6908n.add(m6904i(iLogger, it.next()));
                                }
                            } else if (obj instanceof Map) {
/* 293 */                       objM6908n = m6899d((Map) obj, iLogger);
                            } else {
/* 298 */                       objM6908n = m6908n(iLogger, obj);
/* 306 */                       if (objM6908n.isEmpty()) {
/* 308 */                           objM6908n = obj.toString();
                                }
                            }
/* 315 */                   return objM6908n;
                        } catch (Exception e) {
/* 320 */                   iLogger.mo4671d(EnumC1553m5.INFO, "Not serializing object due to throwing sub-path.", e);
/* 1 */                     return null;
                        }
                    } finally {
/* 327 */               hashSet.remove(obj);
                    }
                }

                @Override // p000.InterfaceC2091q1
                /* JADX INFO: renamed from: j */
                public boolean mo2236j(View view) {
/* 7 */             ((BottomSheetBehavior) this.f14152c).m2254A(this.f14151b);
/* 10 */            return true;
                }

                /* JADX INFO: renamed from: k */
                public void m6905k(C1505c c1505c, ILogger iLogger, Object obj) throws IOException {
/* 3 */             C1732c c1732c = (C1732c) c1505c.f11042b;
/* 5 */             if (obj == null) {
/* 7 */                 c1732c.m5514h();
/* 10 */                return;
                    }
/* 13 */            if (obj instanceof Character) {
/* 25 */                c1505c.m5300y(Character.toString(((Character) obj).charValue()));
/* 28 */                return;
                    }
/* 31 */            if (obj instanceof String) {
/* 35 */                c1505c.m5300y((String) obj);
/* 38 */                return;
                    }
/* 41 */            if (obj instanceof Boolean) {
/* 49 */                c1505c.m5301z(((Boolean) obj).booleanValue());
/* 52 */                return;
                    }
/* 55 */            if (obj instanceof Number) {
/* 59 */                c1505c.m5299x((Number) obj);
/* 62 */                return;
                    }
/* 65 */            if (obj instanceof Date) {
                        try {
/* 77 */                    c1505c.m5300y(AbstractC1417a.m5178q(((Date) obj).getTime()));
/* 607 */                   return;
                        } catch (Exception e) {
/* 87 */                    iLogger.mo4671d(EnumC1553m5.ERROR, "Error when serializing Date", e);
/* 90 */                    c1732c.m5514h();
/* 607 */                   return;
                        }
                    }
/* 97 */            if (obj instanceof TimeZone) {
                        try {
/* 105 */                   c1505c.m5300y(((TimeZone) obj).getID());
/* 607 */                   return;
                        } catch (Exception e2) {
/* 115 */                   iLogger.mo4671d(EnumC1553m5.ERROR, "Error when serializing TimeZone", e2);
/* 118 */                   c1732c.m5514h();
/* 607 */                   return;
                        }
                    }
/* 125 */           if (obj instanceof InterfaceC1458g2) {
/* 129 */               ((InterfaceC1458g2) obj).serialize(c1505c, iLogger);
/* 132 */               return;
                    }
/* 135 */           if (obj instanceof Collection) {
/* 139 */               m6906l(c1505c, iLogger, (Collection) obj);
/* 142 */               return;
                    }
/* 145 */           int i = 0;
/* 146 */           if (obj instanceof boolean[]) {
/* 150 */               boolean[] zArr = (boolean[]) obj;
/* 153 */               ArrayList arrayList = new ArrayList(zArr.length);
/* 156 */               int length = zArr.length;
/* 157 */               while (i < length) {
/* 165 */                   arrayList.add(Boolean.valueOf(zArr[i]));
/* 168 */                   i++;
                        }
/* 171 */               m6906l(c1505c, iLogger, arrayList);
/* 174 */               return;
                    }
/* 177 */           if (obj instanceof byte[]) {
/* 181 */               byte[] bArr = (byte[]) obj;
/* 184 */               ArrayList arrayList2 = new ArrayList(bArr.length);
/* 187 */               int length2 = bArr.length;
/* 188 */               while (i < length2) {
/* 196 */                   arrayList2.add(Byte.valueOf(bArr[i]));
/* 199 */                   i++;
                        }
/* 202 */               m6906l(c1505c, iLogger, arrayList2);
/* 205 */               return;
                    }
/* 208 */           if (obj instanceof short[]) {
/* 212 */               short[] sArr = (short[]) obj;
/* 215 */               ArrayList arrayList3 = new ArrayList(sArr.length);
/* 218 */               int length3 = sArr.length;
/* 219 */               while (i < length3) {
/* 227 */                   arrayList3.add(Short.valueOf(sArr[i]));
/* 230 */                   i++;
                        }
/* 233 */               m6906l(c1505c, iLogger, arrayList3);
/* 236 */               return;
                    }
/* 239 */           if (obj instanceof char[]) {
/* 243 */               char[] cArr = (char[]) obj;
/* 246 */               ArrayList arrayList4 = new ArrayList(cArr.length);
/* 249 */               int length4 = cArr.length;
/* 250 */               while (i < length4) {
/* 258 */                   arrayList4.add(Character.valueOf(cArr[i]));
/* 261 */                   i++;
                        }
/* 264 */               m6906l(c1505c, iLogger, arrayList4);
/* 267 */               return;
                    }
/* 270 */           if (obj instanceof int[]) {
/* 274 */               int[] iArr = (int[]) obj;
/* 277 */               ArrayList arrayList5 = new ArrayList(iArr.length);
/* 280 */               int length5 = iArr.length;
/* 281 */               while (i < length5) {
/* 289 */                   arrayList5.add(Integer.valueOf(iArr[i]));
/* 292 */                   i++;
                        }
/* 295 */               m6906l(c1505c, iLogger, arrayList5);
/* 298 */               return;
                    }
/* 301 */           if (obj instanceof long[]) {
/* 305 */               long[] jArr = (long[]) obj;
/* 308 */               ArrayList arrayList6 = new ArrayList(jArr.length);
/* 311 */               int length6 = jArr.length;
/* 312 */               while (i < length6) {
/* 320 */                   arrayList6.add(Long.valueOf(jArr[i]));
/* 323 */                   i++;
                        }
/* 326 */               m6906l(c1505c, iLogger, arrayList6);
/* 329 */               return;
                    }
/* 332 */           if (obj instanceof float[]) {
/* 336 */               float[] fArr = (float[]) obj;
/* 339 */               ArrayList arrayList7 = new ArrayList(fArr.length);
/* 342 */               int length7 = fArr.length;
/* 343 */               while (i < length7) {
/* 351 */                   arrayList7.add(Float.valueOf(fArr[i]));
/* 354 */                   i++;
                        }
/* 357 */               m6906l(c1505c, iLogger, arrayList7);
/* 360 */               return;
                    }
/* 363 */           if (obj instanceof double[]) {
/* 367 */               double[] dArr = (double[]) obj;
/* 370 */               ArrayList arrayList8 = new ArrayList(dArr.length);
/* 373 */               int length8 = dArr.length;
/* 374 */               while (i < length8) {
/* 382 */                   arrayList8.add(Double.valueOf(dArr[i]));
/* 385 */                   i++;
                        }
/* 388 */               m6906l(c1505c, iLogger, arrayList8);
/* 391 */               return;
                    }
/* 400 */           if (obj.getClass().isArray()) {
/* 408 */               m6906l(c1505c, iLogger, Arrays.asList((Object[]) obj));
/* 411 */               return;
                    }
/* 414 */           if (obj instanceof Map) {
/* 418 */               m6907m(c1505c, iLogger, (Map) obj);
/* 421 */               return;
                    }
/* 424 */           if (obj instanceof Locale) {
/* 430 */               c1505c.m5300y(obj.toString());
/* 433 */               return;
                    }
/* 436 */           if (obj instanceof AtomicIntegerArray) {
/* 438 */               AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
/* 440 */               Charset charset = AbstractC1706e.f11729a;
/* 442 */               int length9 = atomicIntegerArray.length();
/* 448 */               ArrayList arrayList9 = new ArrayList(length9);
/* 451 */               while (i < length9) {
/* 461 */                   arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i)));
/* 464 */                   i++;
                        }
/* 467 */               m6906l(c1505c, iLogger, arrayList9);
/* 470 */               return;
                    }
/* 473 */           if (obj instanceof AtomicBoolean) {
/* 481 */               c1505c.m5301z(((AtomicBoolean) obj).get());
/* 484 */               return;
                    }
/* 487 */           if (obj instanceof URI) {
/* 493 */               c1505c.m5300y(obj.toString());
/* 496 */               return;
                    }
/* 499 */           if (obj instanceof InetAddress) {
/* 505 */               c1505c.m5300y(obj.toString());
/* 508 */               return;
                    }
/* 511 */           if (obj instanceof UUID) {
/* 517 */               c1505c.m5300y(obj.toString());
/* 520 */               return;
                    }
/* 523 */           if (obj instanceof Currency) {
/* 529 */               c1505c.m5300y(obj.toString());
/* 532 */               return;
                    }
/* 535 */           if (obj instanceof Calendar) {
/* 543 */               m6907m(c1505c, iLogger, AbstractC1706e.m5470b((Calendar) obj));
/* 546 */               return;
                    }
/* 555 */           if (obj.getClass().isEnum()) {
/* 561 */               c1505c.m5300y(obj.toString());
/* 564 */               return;
                    }
                    try {
/* 569 */               if (((C1954n7) this.f14152c) == null) {
/* 580 */                   this.f14152c = new C1954n7(this.f14151b, 10);
                        }
/* 590 */               m6905k(c1505c, iLogger, ((C1954n7) this.f14152c).m6904i(iLogger, obj));
                    } catch (Exception e3) {
/* 599 */               iLogger.mo4671d(EnumC1553m5.ERROR, "Failed serializing unknown object.", e3);
/* 604 */               c1505c.m5300y("[OBJECT]");
                    }
                }

                /* JADX INFO: renamed from: l */
                public void m6906l(C1505c c1505c, ILogger iLogger, Collection collection) throws IOException {
/* 3 */             C1732c c1732c = (C1732c) c1505c.f11042b;
/* 5 */             c1732c.m5517l();
/* 8 */             c1732c.m5511c();
/* 11 */            int i = c1732c.f11786c;
/* 13 */            int[] iArr = c1732c.f11785b;
/* 17 */            if (i == iArr.length) {
/* 24 */                c1732c.f11785b = Arrays.copyOf(iArr, i * 2);
                    }
/* 26 */            int[] iArr2 = c1732c.f11785b;
/* 28 */            int i2 = c1732c.f11786c;
/* 32 */            c1732c.f11786c = i2 + 1;
/* 35 */            iArr2[i2] = 1;
/* 41 */            c1732c.f11784a.write(91);
/* 44 */            Iterator it = collection.iterator();
/* 52 */            while (it.hasNext()) {
/* 58 */                m6905k(c1505c, iLogger, it.next());
                    }
/* 64 */            c1732c.m5512f(1, 2, ']');
                }

                /* JADX INFO: renamed from: m */
                public void m6907m(C1505c c1505c, ILogger iLogger, Map map) throws IOException {
/* 1 */             c1505c.m5287i();
/* 16 */            for (Object obj : map.keySet()) {
/* 24 */                if (obj instanceof String) {
/* 29 */                    c1505c.m5291p((String) obj);
/* 36 */                    m6905k(c1505c, iLogger, map.get(obj));
                        }
                    }
/* 40 */            c1505c.m5288l();
                }

                /* JADX INFO: renamed from: n */
                public HashMap m6908n(ILogger iLogger, Object obj) {
/* 5 */             Field[] declaredFields = obj.getClass().getDeclaredFields();
/* 11 */            HashMap map = new HashMap();
/* 17 */            for (Field field : declaredFields) {
/* 29 */                if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
/* 43 */                    String name = field.getName();
                            try {
/* 48 */                        field.setAccessible(true);
/* 59 */                        map.put(name, m6904i(iLogger, field.get(obj)));
/* 62 */                        field.setAccessible(false);
                            } catch (Exception unused) {
/* 78 */                        iLogger.mo4672k(EnumC1553m5.INFO, fm0.m3784j("Cannot access field ", name, "."), new Object[0]);
                            }
                        }
                    }
/* 84 */            return map;
                }

                /* JADX WARN: Code duplicated, block: B:36:0x006a  */
                /* JADX WARN: Code duplicated, block: B:38:0x006d  */
                /* JADX INFO: renamed from: o */
                public int m6909o(int i) {
/* 3 */             SparseArray sparseArray = (SparseArray) this.f14152c;
/* 5 */             int i2 = 0;
/* 9 */             if (-1 == i) {
/* 24 */                wg2 wg2Var = i == -1 ? (wg2) sparseArray.valueAt(0) : (wg2) sparseArray.get(-1);
/* 26 */                if (wg2Var != null) {
/* 29 */                    ArrayList arrayList = wg2Var.f18618b;
                            while (true) {
/* 35 */                        if (i2 >= arrayList.size()) {
/* 53 */                            i2 = -1;
                                    break;
                                }
/* 47 */                        if (((xg2) arrayList.get(i2)).m9792a(-1.0f, -1.0f)) {
                                    break;
                                }
/* 50 */                        i2++;
                            }
/* 54 */                    if (-1 != i2) {
                                return i2 == -1 ? wg2Var.f18619c : ((xg2) arrayList.get(i2)).f19087e;
                            }
                        }
                    } else {
/* 75 */                wg2 wg2Var2 = (wg2) sparseArray.get(i);
/* 77 */                if (wg2Var2 != null) {
/* 80 */                    ArrayList arrayList2 = wg2Var2.f18618b;
/* 86 */                    while (i2 < arrayList2.size()) {
/* 98 */                        if (((xg2) arrayList2.get(i2)).m9792a(-1.0f, -1.0f)) {
                                    return i2 == -1 ? wg2Var2.f18619c : ((xg2) arrayList2.get(i2)).f19087e;
                                }
/* 101 */                       i2++;
                            }
/* 104 */                   i2 = -1;
                            if (i2 == -1) {
                            }
                        }
                    }
/* 6 */             return -1;
                }

                /* JADX INFO: renamed from: p */
                public void m6910p(String str) {
/* 1 */             str.getClass();
/* 4 */             int length = str.length();
/* 8 */             if (length == 0) {
/* 10 */                return;
                    }
/* 13 */            m6898c(this.f14151b, length);
/* 27 */            str.getChars(0, str.length(), (char[]) this.f14152c, this.f14151b);
/* 33 */            this.f14151b += length;
                }

                public String toString() {
                    switch (this.f14150a) {
                        case 5:
/* 20 */                    return new String((char[]) this.f14152c, 0, this.f14151b);
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 176 */       public /* synthetic */ C1954n7(int i, int i2) {
/* 177 */           this.f14150a = i2;
                    this.f14151b = i;
                }

/* 177 */       public /* synthetic */ C1954n7(int i, Object obj, int i2) {
/* 178 */           this.f14150a = i2;
                    this.f14151b = i;
                    this.f14152c = obj;
                }

/* 178 */       public /* synthetic */ C1954n7(Object obj, int i, int i2) {
/* 179 */           this.f14150a = i2;
                    this.f14152c = obj;
                    this.f14151b = i;
                }

/* 179 */       public C1954n7(wl0 wl0Var, C1837kn c1837kn) {
                    this.f14150a = 6;
/* 181 */           this.f14152c = c1837kn;
                }

/* 181 */       public /* synthetic */ C1954n7(int i) {
/* 182 */           this.f14150a = i;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 182 */       public C1954n7(Context context) {
/* 183 */           this(context, DialogInterfaceC1991o7.m7107e(context, 0));
                    this.f14150a = 0;
                }

/* 183 */       public C1954n7(Context context, int i) {
                    this.f14150a = 0;
/* 185 */           this.f14152c = new C1783j7(new ContextThemeWrapper(context, DialogInterfaceC1991o7.m7107e(context, i)));
/* 187 */           this.f14151b = i;
                }
            }
