            package p000;

            import android.content.Intent;
            import android.content.IntentSender;
            import android.graphics.Typeface;
            import android.os.Bundle;
            import android.view.View;
            import android.widget.TextView;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import java.util.ArrayList;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: renamed from: pb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class RunnableC2064pb implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15048a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f15049b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15050c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f15051d;

                public RunnableC2064pb(TextView textView, Typeface typeface, int i) {
/* 2 */             this.f15048a = 0;
/* 7 */             this.f15050c = textView;
/* 9 */             this.f15051d = typeface;
/* 11 */            this.f15049b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0202c3 interfaceC0202c3;
                    ArrayList arrayList;
                    C2260um c2260um;
                    ArrayList arrayList2;
/* 1 */             int i = this.f15048a;
/* 4 */             Object obj = this.f15050c;
/* 6 */             int i2 = this.f15049b;
/* 8 */             Object obj2 = this.f15051d;
                    switch (i) {
                        case 0:
/* 376 */                   ((TextView) obj).setTypeface((Typeface) obj2, i2);
/* 379 */                   return;
                        case 1:
/* 366 */                   int i3 = BottomSheetBehavior.f4476b0;
/* 368 */                   ((BottomSheetBehavior) obj2).m2257D(i2, (View) obj, false);
/* 371 */                   return;
                        case 2:
/* 303 */                   C2310vx c2310vx = (C2310vx) obj2;
/* 307 */                   Object obj3 = ((qc3) obj).f15492b;
/* 319 */                   String str = (String) c2310vx.f12566a.get(Integer.valueOf(i2));
/* 321 */                   if (str == null) {
/* 361 */                       return;
                            }
/* 330 */                   C1014i3 c1014i3 = (C1014i3) c2310vx.f12570e.get(str);
/* 332 */                   if (c1014i3 == null || (interfaceC0202c3 = c1014i3.f9430a) == null) {
/* 353 */                       c2310vx.f12572g.remove(str);
/* 358 */                       c2310vx.f12571f.put(str, obj3);
/* 361 */                       return;
                            } else {
/* 345 */                       if (c2310vx.f12569d.remove(str)) {
/* 347 */                           interfaceC0202c3.mo198c(obj3);
/* 361 */                           return;
                                }
/* 361 */                       return;
                            }
                        case 3:
/* 299 */                   ((C2310vx) obj2).m5937a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
/* 302 */                   return;
                        case 4:
/* 274 */                   ((d30) obj2).f6966b.onNavigationEvent(i2, (Bundle) obj);
/* 277 */                   return;
                        default:
/* 13 */                    f81 f81Var = (f81) obj2;
/* 15 */                    s81 s81Var = (s81) obj;
/* 17 */                    boolean z = f81Var.f8041c;
/* 21 */                    AtomicInteger atomicInteger = f81Var.f8042d;
/* 23 */                    ArrayList arrayList3 = f81Var.f8040b;
/* 25 */                    s81 s81Var2 = f81Var.f8043e;
/* 31 */                    if (s81Var2.isDone() || arrayList3 == null) {
/* 264 */                       de3.m3028j("Future was done before all dependencies completed", z);
/* 267 */                       return;
                            }
                            try {
/* 45 */                        de3.m3028j("Tried to set value from future which is not done", s81Var.isDone());
/* 52 */                        arrayList3.set(i2, w11.m9448r(s81Var));
/* 55 */                        int iDecrementAndGet = atomicInteger.decrementAndGet();
/* 62 */                        de3.m3028j("Less than 0 remaining futures", iDecrementAndGet >= 0);
/* 65 */                        if (iDecrementAndGet == 0) {
/* 69 */                            if (arrayList != null) {
/* 71 */                                c2260um = f81Var.f8044f;
/* 75 */                                arrayList2 = new ArrayList(arrayList);
/* 78 */                                c2260um.m9040a(arrayList2);
/* 267 */                               return;
                                    }
/* 267 */                           return;
                                }
/* 267 */                       return;
                            } catch (CancellationException unused) {
/* 196 */                       if (z) {
/* 198 */                           f81Var.cancel(false);
                                }
/* 237 */                       int iDecrementAndGet2 = atomicInteger.decrementAndGet();
/* 244 */                       de3.m3028j("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
/* 247 */                       if (iDecrementAndGet2 == 0) {
/* 251 */                           if (arrayList != null) {
/* 253 */                               c2260um = f81Var.f8044f;
/* 257 */                               arrayList2 = new ArrayList(arrayList);
                                    }
/* 267 */                           return;
                                }
/* 267 */                       return;
                            } catch (ExecutionException e) {
/* 161 */                       if (z) {
/* 169 */                           f81Var.f8044f.m9041b(e.getCause());
                                }
/* 172 */                       int iDecrementAndGet3 = atomicInteger.decrementAndGet();
/* 179 */                       de3.m3028j("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
/* 182 */                       if (iDecrementAndGet3 == 0) {
/* 186 */                           if (arrayList != null) {
/* 188 */                               c2260um = f81Var.f8044f;
/* 192 */                               arrayList2 = new ArrayList(arrayList);
                                    }
/* 267 */                           return;
                                }
/* 267 */                       return;
                            } catch (Error e2) {
/* 103 */                       f81Var.f8044f.m9041b(e2);
/* 106 */                       int iDecrementAndGet4 = atomicInteger.decrementAndGet();
/* 113 */                       de3.m3028j("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
/* 116 */                       if (iDecrementAndGet4 == 0) {
/* 120 */                           if (arrayList != null) {
/* 122 */                               c2260um = f81Var.f8044f;
/* 126 */                               arrayList2 = new ArrayList(arrayList);
                                    }
/* 267 */                           return;
                                }
/* 267 */                       return;
                            } catch (RuntimeException e3) {
/* 130 */                       if (z) {
/* 134 */                           f81Var.f8044f.m9041b(e3);
                                }
/* 137 */                       int iDecrementAndGet5 = atomicInteger.decrementAndGet();
/* 144 */                       de3.m3028j("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
/* 147 */                       if (iDecrementAndGet5 == 0) {
/* 151 */                           if (arrayList != null) {
/* 153 */                               c2260um = f81Var.f8044f;
/* 157 */                               arrayList2 = new ArrayList(arrayList);
                                    }
/* 267 */                           return;
                                }
/* 267 */                       return;
                            } finally {
/* 202 */                       int iDecrementAndGet6 = atomicInteger.decrementAndGet();
/* 209 */                       de3.m3028j("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
/* 212 */                       if (iDecrementAndGet6 == 0) {
/* 214 */                           arrayList = f81Var.f8040b;
/* 216 */                           if (arrayList != null) {
/* 225 */                               f81Var.f8044f.m9040a(new ArrayList(arrayList));
                                    } else {
/* 233 */                               de3.m3028j(null, s81Var2.isDone());
                                    }
                                }
                            }
                    }
                }

/* 13 */        public /* synthetic */ RunnableC2064pb(Object obj, int i, Object obj2, int i2) {
/* 14 */            this.f15048a = i2;
                    this.f15051d = obj;
                    this.f15049b = i;
                    this.f15050c = obj2;
                }

/* 14 */        public RunnableC2064pb(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
                    this.f15048a = 1;
                    this.f15051d = bottomSheetBehavior;
                    this.f15050c = view;
                    this.f15049b = i;
                }
            }
