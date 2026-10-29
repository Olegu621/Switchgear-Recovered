            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.PackageManager;
            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.media.ImageReader;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.support.v4.media.MediaBrowserCompat;
            import android.text.TextUtils;
            import android.view.View;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.locks.LockSupport;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okio.Utf8;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i13 {

                /* JADX INFO: renamed from: b */
                public static final C2131r4 f9399b = new C2131r4("NO_DECISION", 8);

                /* JADX INFO: renamed from: c */
                public static final char[] f9400c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                /* JADX INFO: renamed from: d */
                public static final char[] f9401d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

                /* JADX INFO: renamed from: e */
                public static final mz1 f9402e = new mz1();

                /* JADX INFO: renamed from: f */
                public static final String[] f9403f = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.Event.AD_IMPRESSION, FirebaseAnalytics.Event.SCREEN_VIEW, "ga_extra_parameter", "app_background", "firebase_campaign"};

                /* JADX INFO: renamed from: g */
                public static final String[] f9404g = {FirebaseAnalytics.Event.AD_IMPRESSION};

                /* JADX INFO: renamed from: h */
                public static final String[] f9405h = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

                /* JADX INFO: renamed from: i */
                public static final String[] f9406i = {FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.REFUND, FirebaseAnalytics.Event.ADD_PAYMENT_INFO, FirebaseAnalytics.Event.ADD_SHIPPING_INFO, FirebaseAnalytics.Event.ADD_TO_CART, FirebaseAnalytics.Event.ADD_TO_WISHLIST, FirebaseAnalytics.Event.BEGIN_CHECKOUT, FirebaseAnalytics.Event.REMOVE_FROM_CART, FirebaseAnalytics.Event.SELECT_ITEM, FirebaseAnalytics.Event.SELECT_PROMOTION, FirebaseAnalytics.Event.VIEW_CART, FirebaseAnalytics.Event.VIEW_ITEM, FirebaseAnalytics.Event.VIEW_ITEM_LIST, FirebaseAnalytics.Event.VIEW_PROMOTION, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.Event.SELECT_CONTENT, FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS};

                /* JADX INFO: renamed from: j */
                public static Method f9407j;

                /* JADX INFO: renamed from: k */
                public static Method f9408k;

                /* JADX INFO: renamed from: l */
                public static boolean f9409l;

                /* JADX INFO: renamed from: m */
                public static Boolean f9410m;

                /* JADX INFO: renamed from: n */
                public static Boolean f9411n;

                /* JADX INFO: renamed from: o */
                public static Boolean f9412o;

                /* JADX INFO: renamed from: p */
                public static Boolean f9413p;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9414a;

                public /* synthetic */ i13(int i) {
/* 1 */             this.f9414a = i;
                }

                /* JADX INFO: renamed from: A */
                public static Object m4419A(Function2 function2) throws Throwable {
/* 1 */             C1846g c1846g = C1846g.f12919a;
/* 3 */             Thread threadCurrentThread = Thread.currentThread();
/* 7 */             e10 e10Var = InterfaceC1843d.f12918S;
/* 9 */             c1846g.getClass();
/* 12 */            e10Var.getClass();
/* 15 */            ze0 ze0VarM3167a = do2.m3167a();
/* 20 */            CoroutineContext coroutineContextM5645g = j13.m5645g(c1846g, ze0VarM3167a, true);
/* 24 */            m60 m60Var = z80.f19975a;
/* 26 */            if (coroutineContextM5645g != m60Var && coroutineContextM5645g.get(e10Var) == null) {
/* 34 */                coroutineContextM5645g = coroutineContextM5645g.plus(m60Var);
                    }
/* 40 */            C2333wj c2333wj = new C2333wj(coroutineContextM5645g, threadCurrentThread, ze0VarM3167a);
/* 45 */            c2333wj.m4405W(b20.f2175a, c2333wj, function2);
/* 49 */            ze0 ze0Var = c2333wj.f18658i;
/* 51 */            if (ze0Var != null) {
/* 53 */                int i = ze0.f20121f;
/* 55 */                ze0Var.m10347n(false);
                    }
/* 62 */            while (!Thread.interrupted()) {
                        try {
/* 73 */                    long jMo3419o = ze0Var != null ? ze0Var.mo3419o() : Long.MAX_VALUE;
/* 82 */                    if (c2333wj.isCompleted()) {
/* 88 */                        if (ze0Var != null) {
/* 90 */                            int i2 = ze0.f20121f;
/* 92 */                            ze0Var.m10345l(false);
                                }
/* 99 */                        Object objM5637B = j13.m5637B(c2333wj.m10260x());
/* 111 */                       C1980nx c1980nx = objM5637B instanceof C1980nx ? (C1980nx) objM5637B : null;
/* 112 */                       if (c1980nx == null) {
/* 114 */                           return objM5637B;
                                }
/* 117 */                       throw c1980nx.f14555a;
                            }
/* 84 */                    LockSupport.parkNanos(c2333wj, jMo3419o);
                        } catch (Throwable th) {
/* 127 */                   if (ze0Var != null) {
/* 129 */                       int i3 = ze0.f20121f;
/* 131 */                       ze0Var.m10345l(false);
                            }
/* 134 */                   throw th;
                        }
                    }
/* 120 */           InterruptedException interruptedException = new InterruptedException();
/* 123 */           c2333wj.m10251j(interruptedException);
/* 126 */           throw interruptedException;
                }

                /* JADX INFO: renamed from: B */
                public static void m4420B(View view, CharSequence charSequence) {
/* 5 */             if (Build.VERSION.SDK_INT >= 26) {
/* 7 */                 aq2.m1149a(view, charSequence);
/* 10 */                return;
                    }
/* 11 */            cq2 cq2Var = cq2.f6875V;
/* 14 */            if (cq2Var != null && cq2Var.f6878a == view) {
/* 20 */                cq2.m2832b(null);
                    }
/* 27 */            if (!TextUtils.isEmpty(charSequence)) {
/* 53 */                new cq2(view, charSequence);
/* 56 */                return;
                    }
/* 29 */            cq2 cq2Var2 = cq2.f6876W;
/* 31 */            if (cq2Var2 != null && cq2Var2.f6878a == view) {
/* 37 */                cq2Var2.m2833a();
                    }
/* 40 */            view.setOnLongClickListener(null);
/* 44 */            view.setLongClickable(false);
/* 47 */            view.setOnHoverListener(null);
                }

                /* JADX INFO: renamed from: C */
                public static int m4421C(byte[] bArr, int i, long j, int i2) {
/* 1 */             if (i2 == 0) {
/* 40 */                i13 i13Var = m13.f13547a;
/* 44 */                if (i > -12) {
/* 46 */                    return -1;
                        }
/* 48 */                return i;
                    }
/* 4 */             if (i2 == 1) {
/* 35 */                return m13.m6591c(i, my2.m6821g(bArr, j));
                    }
/* 7 */             if (i2 == 2) {
/* 20 */                return m13.m6592d(i, my2.m6821g(bArr, j), my2.m6821g(bArr, j + 1));
                    }
/* 30 */            throw new AssertionError();
                }

                /* JADX INFO: renamed from: D */
                public static final Object m4422D(CoroutineContext coroutineContext, Function2 function2, c10 c10Var) throws Throwable {
                    Object objM5637B;
/* 1 */             CoroutineContext context = c10Var.getContext();
/* 27 */            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, p10.f14947a)).booleanValue() ? context.plus(coroutineContext) : j13.m5645g(context, coroutineContext, false);
/* 31 */            hu0.m4328W(coroutineContextPlus);
/* 34 */            if (coroutineContextPlus == context) {
/* 38 */                p72 p72Var = new p72(c10Var, coroutineContextPlus);
/* 41 */                objM5637B = xe2.m9762F(p72Var, p72Var, function2);
                    } else {
/* 46 */                e10 e10Var = InterfaceC1843d.f12918S;
/* 61 */                if (Intrinsics.m6216a(coroutineContextPlus.get(e10Var), context.get(e10Var))) {
/* 65 */                    kx2 kx2Var = new kx2(c10Var, coroutineContextPlus);
/* 68 */                    CoroutineContext coroutineContext2 = kx2Var.f9377e;
/* 70 */                    Object objM1741c = co2.m1741c(coroutineContext2, null);
                            try {
/* 74 */                        Object objM9762F = xe2.m9762F(kx2Var, kx2Var, function2);
/* 78 */                        co2.m1739a(coroutineContext2, objM1741c);
/* 81 */                        objM5637B = objM9762F;
                            } catch (Throwable th) {
/* 84 */                        co2.m1739a(coroutineContext2, objM1741c);
/* 87 */                        throw th;
                            }
                        } else {
/* 90 */                    q80 q80Var = new q80(c10Var, coroutineContextPlus);
/* 93 */                    w11.m9396F(function2, q80Var, q80Var);
/* 96 */                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q80.f15439i;
/* 136 */                   do {
/* 98 */                        int i = atomicIntegerFieldUpdater.get(q80Var);
/* 102 */                       if (i != 0) {
/* 105 */                           if (i != 2) {
/* 127 */                               f42.m3656l("Already suspended");
/* 60 */                                return null;
                                    }
/* 111 */                           objM5637B = j13.m5637B(q80Var.m10260x());
/* 117 */                           if (objM5637B instanceof C1980nx) {
/* 124 */                               throw ((C1980nx) objM5637B).f14555a;
                                    }
                                }
/* 136 */                   } while (!atomicIntegerFieldUpdater.compareAndSet(q80Var, 0, 1));
/* 138 */                   objM5637B = z10.f19902a;
                        }
                    }
/* 140 */           z10 z10Var = z10.f19902a;
/* 142 */           return objM5637B;
                }

                /* JADX INFO: renamed from: E */
                public static String m4423E(cn3 cn3Var) {
/* 7 */             StringBuilder sb = new StringBuilder(cn3Var.mo320c());
/* 15 */            for (int i = 0; i < cn3Var.mo320c(); i++) {
/* 17 */                byte bMo318a = cn3Var.mo318a(i);
/* 23 */                if (bMo318a == 34) {
/* 137 */                   sb.append("\\\"");
                        } else if (bMo318a == 39) {
/* 131 */                   sb.append("\\'");
                        } else if (bMo318a != 92) {
                            switch (bMo318a) {
                                case 7:
/* 119 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 113 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 107 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 101 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 95 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 89 */                            sb.append("\\f");
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 83 */                            sb.append("\\r");
                                    break;
                                default:
/* 38 */                            if (bMo318a < 32 || bMo318a > 126) {
/* 49 */                                sb.append('\\');
/* 59 */                                sb.append((char) (((bMo318a >>> 6) & 3) + 48));
/* 69 */                                sb.append((char) (((bMo318a >>> 3) & 7) + 48));
/* 77 */                                sb.append((char) ((bMo318a & 7) + 48));
                                    } else {
/* 45 */                                sb.append((char) bMo318a);
                                    }
                                    break;
                            }
                        } else {
/* 125 */                   sb.append("\\\\");
                        }
                    }
/* 144 */           return sb.toString();
                }

                /* JADX INFO: renamed from: a */
                public static void m4424a(int i, int i2) {
                    String strM5641a;
/* 1 */             if (i < 0 || i >= i2) {
/* 11 */                if (i < 0) {
/* 54 */                    strM5641a = j13.m5641a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
                        } else {
/* 13 */                    if (i2 < 0) {
/* 21 */                        C1951n4.m6859j(fm0.m3781g(i2, "negative size: "));
/* 24 */                        return;
                            }
/* 39 */                    strM5641a = j13.m5641a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
                        }
/* 61 */                throw new IndexOutOfBoundsException(strM5641a);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static boolean m4425b(Bundle bundle, Bundle bundle2) {
/* 2 */             if (bundle == bundle2) {
/* 1 */                 return true;
                    }
/* 11 */            if (bundle == null) {
                        return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1;
                    }
/* 27 */            if (bundle2 == null) {
                        return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1;
                    }
                    return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                }

                /* JADX INFO: renamed from: c */
                public static C2466xm m4426c(f70 f70Var) {
/* 5 */             C2260um c2260um = new C2260um();
/* 13 */            c2260um.f17592c = new u32();
/* 17 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 20 */            c2260um.f17591b = c2466xm;
/* 24 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 32 */                f70Var.invokeOnCompletion(new C1996oc(4, c2260um, f70Var));
/* 35 */                c2260um.f17590a = "Deferred.asListenableFuture";
/* 37 */                return c2466xm;
                    } catch (Exception e) {
/* 39 */                c2466xm.m9977b(e);
/* 42 */                return c2466xm;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static f70 m4427d(y10 y10Var, CoroutineContext coroutineContext, Function2 function2, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 coroutineContext = C1846g.f12919a;
                    }
/* 7 */             b20 b20Var = b20.f2175a;
/* 9 */             CoroutineContext coroutineContextM5653o = j13.m5653o(y10Var, coroutineContext);
/* 13 */            b20 b20Var2 = b20.f2175a;
/* 17 */            f70 f70Var = new f70(coroutineContextM5653o, true);
/* 20 */            f70Var.m4405W(b20Var, f70Var, function2);
/* 23 */            return f70Var;
                }

                /* JADX WARN: Code duplicated, block: B:24:0x0041  */
                /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:32:0x0052  */
                /* JADX WARN: Code duplicated, block: B:34:0x0058  */
                /* JADX WARN: Code duplicated, block: B:36:0x005c  */
                /* JADX WARN: Code duplicated, block: B:37:0x0061  */
                /* JADX WARN: Code duplicated, block: B:38:0x0066  */
                /* JADX INFO: renamed from: e */
                public static boolean m4428e(int i, Rect rect, Rect rect2, Rect rect3) {
                    int iM4445y;
                    int i2;
                    int i3;
/* 1 */             boolean zM4429f = m4429f(i, rect, rect2);
/* 10 */            if (!m4429f(i, rect, rect3) && zM4429f) {
/* 27 */                if (i != 17) {
/* 29 */                    if (i != 33) {
/* 31 */                        if (i != 66) {
/* 33 */                            if (i != 130) {
/* 42 */                                C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 9 */                                 return false;
                                    }
/* 39 */                            if (rect.bottom <= rect3.top) {
/* 66 */                                if (i != 17 && i != 66) {
/* 71 */                                    iM4445y = m4445y(i, rect, rect2);
/* 75 */                                    if (i != 17) {
/* 103 */                                       i2 = rect.left;
/* 105 */                                       i3 = rect3.left;
                                            } else if (i != 33) {
/* 98 */                                        i2 = rect.top;
/* 100 */                                       i3 = rect3.top;
                                            } else if (i != 66) {
/* 93 */                                        i2 = rect3.right;
/* 95 */                                        i3 = rect.right;
                                            } else {
/* 81 */                                        if (i == 130) {
/* 89 */                                            C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 9 */                                             return false;
                                                }
/* 83 */                                        i2 = rect3.bottom;
/* 85 */                                        i3 = rect.bottom;
                                            }
/* 112 */                                   if (iM4445y < Math.max(1, i2 - i3)) {
                                            }
                                        }
                                    }
                                } else if (rect.right <= rect3.left) {
/* 66 */                            if (i != 17) {
/* 71 */                                iM4445y = m4445y(i, rect, rect2);
/* 75 */                                if (i != 17) {
/* 103 */                                   i2 = rect.left;
/* 105 */                                   i3 = rect3.left;
                                        } else if (i != 33) {
/* 98 */                                    i2 = rect.top;
/* 100 */                                   i3 = rect3.top;
                                        } else if (i != 66) {
/* 93 */                                    i2 = rect3.right;
/* 95 */                                    i3 = rect.right;
                                        } else {
/* 81 */                                    if (i == 130) {
/* 89 */                                        C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 9 */                                         return false;
                                            }
/* 83 */                                    i2 = rect3.bottom;
/* 85 */                                    i3 = rect.bottom;
                                        }
/* 112 */                               if (iM4445y < Math.max(1, i2 - i3)) {
                                        }
                                    }
                                }
                            } else if (rect.top >= rect3.bottom) {
/* 66 */                        if (i != 17) {
/* 71 */                            iM4445y = m4445y(i, rect, rect2);
/* 75 */                            if (i != 17) {
/* 103 */                               i2 = rect.left;
/* 105 */                               i3 = rect3.left;
                                    } else if (i != 33) {
/* 98 */                                i2 = rect.top;
/* 100 */                               i3 = rect3.top;
                                    } else if (i != 66) {
/* 93 */                                i2 = rect3.right;
/* 95 */                                i3 = rect.right;
                                    } else {
/* 81 */                                if (i == 130) {
/* 89 */                                    C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 9 */                                     return false;
                                        }
/* 83 */                                i2 = rect3.bottom;
/* 85 */                                i3 = rect.bottom;
                                    }
/* 112 */                           if (iM4445y < Math.max(1, i2 - i3)) {
                                    }
                                }
                            }
                        } else if (rect.left >= rect3.right) {
/* 66 */                    if (i != 17) {
/* 71 */                        iM4445y = m4445y(i, rect, rect2);
/* 75 */                        if (i != 17) {
/* 103 */                           i2 = rect.left;
/* 105 */                           i3 = rect3.left;
                                } else if (i != 33) {
/* 98 */                            i2 = rect.top;
/* 100 */                           i3 = rect3.top;
                                } else if (i != 66) {
/* 93 */                            i2 = rect3.right;
/* 95 */                            i3 = rect.right;
                                } else {
/* 81 */                            if (i == 130) {
/* 89 */                                C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 9 */                                 return false;
                                    }
/* 83 */                            i2 = rect3.bottom;
/* 85 */                            i3 = rect.bottom;
                                }
/* 112 */                       if (iM4445y < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
/* 26 */                return true;
                    }
/* 9 */             return false;
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0025  */
                /* JADX INFO: renamed from: f */
                public static boolean m4429f(int i, Rect rect, Rect rect2) {
/* 4 */             if (i != 17) {
/* 8 */                 if (i != 33) {
/* 12 */                    if (i != 66) {
/* 16 */                        if (i != 130) {
/* 21 */                            C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 3 */                             return false;
                                }
                            } else if (rect2.bottom < rect.top) {
                            }
                        }
/* 29 */                if (rect2.right >= rect.left && rect2.left <= rect.right) {
/* 50 */                    return true;
                        }
                    } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
/* 50 */                return true;
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: g */
                public static void m4430g(int i, int i2, int i3) {
                    String strM4434k;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strM4434k = m4434k(i, i3, "start index");
                        } else {
/* 41 */                    strM4434k = (i2 < 0 || i2 > i3) ? m4434k(i2, i3, "end index") : j13.m5641a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strM4434k);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:110:0x01aa  */
                /* JADX WARN: Code duplicated, block: B:117:0x01cb  */
                /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:27:0x008c  */
                /* JADX WARN: Code duplicated, block: B:66:0x0119  */
                /* JADX INFO: renamed from: h */
                public static final KSerializer m4431h(o21 o21Var, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
                    Object obj;
                    Class[] clsArr;
                    KSerializer kSerializer;
                    KSerializer kSerializer2;
                    KSerializer kSerializer3;
                    da2 da2Var;
                    Field field;
/* 3 */             o21Var.getClass();
/* 6 */             Class clsM10224s = yy1.m10224s(o21Var);
/* 15 */            KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
/* 25 */            if (clsM10224s.isEnum() && clsM10224s.getAnnotation(da2.class) == null && clsM10224s.getAnnotation(kt1.class) == null) {
/* 39 */                Object[] enumConstants = clsM10224s.getEnumConstants();
/* 45 */                String canonicalName = clsM10224s.getCanonicalName();
/* 49 */                canonicalName.getClass();
/* 52 */                enumConstants.getClass();
/* 57 */                return new oe0(canonicalName, (Enum[]) enumConstants);
                    }
/* 67 */            mt1 mt1Var = null;
/* 68 */            if (clsM10224s.isInterface()) {
/* 74 */                da2 da2Var2 = (da2) clsM10224s.getAnnotation(da2.class);
/* 105 */               mt1 mt1Var2 = (da2Var2 == null || j22.m5667a(da2Var2.with()).equals(j22.m5667a(mt1.class))) ? new mt1(j22.m5667a(clsM10224s)) : null;
/* 108 */               if (mt1Var2 != null) {
/* 110 */                   return mt1Var2;
                        }
                    }
/* 116 */           KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length);
                    try {
/* 121 */               Field declaredField = clsM10224s.getDeclaredField("Companion");
/* 125 */               declaredField.setAccessible(true);
/* 128 */               obj = declaredField.get(null);
                    } catch (Throwable unused) {
/* 133 */               obj = null;
                    }
/* 139 */           if (obj == null) {
/* 141 */               kSerializer = null;
                    } else {
                        try {
/* 144 */                   if (kSerializerArr3.length == 0) {
/* 146 */                       clsArr = new Class[0];
                            } else {
/* 149 */                       int length = kSerializerArr3.length;
/* 150 */                       Class[] clsArr2 = new Class[length];
/* 153 */                       for (int i = 0; i < length; i++) {
/* 155 */                           clsArr2[i] = KSerializer.class;
                                }
/* 160 */                       clsArr = clsArr2;
                            }
/* 181 */                   Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr3, kSerializerArr3.length));
/* 187 */                   if (objInvoke instanceof KSerializer) {
/* 189 */                       kSerializer = (KSerializer) objInvoke;
                            } else {
/* 141 */                       kSerializer = null;
                            }
                        } catch (NoSuchMethodException unused2) {
                        } catch (InvocationTargetException e) {
/* 193 */                   Throwable cause = e.getCause();
/* 197 */                   if (cause == null) {
/* 215 */                       throw e;
                            }
/* 201 */                   String message = cause.getMessage();
/* 205 */                   if (message == null) {
/* 207 */                       message = e.getMessage();
                            }
/* 214 */                   throw new InvocationTargetException(cause, message);
                        }
                    }
/* 216 */           if (kSerializer != null) {
/* 470 */               return kSerializer;
                    }
/* 220 */           Field[] declaredFields = clsM10224s.getDeclaredFields();
/* 224 */           declaredFields.getClass();
/* 227 */           int length2 = declaredFields.length;
/* 228 */           Field field2 = null;
/* 229 */           int i2 = 0;
/* 230 */           boolean z = false;
                    while (true) {
/* 233 */               if (i2 >= length2) {
/* 277 */                   if (!z) {
                                break;
                            }
                            break;
                        }
/* 235 */               Field field3 = declaredFields[i2];
/* 245 */               if (Intrinsics.m6216a(field3.getName(), "INSTANCE") && Intrinsics.m6216a(field3.getType(), clsM10224s) && Modifier.isStatic(field3.getModifiers())) {
/* 267 */                   if (!z) {
/* 271 */                       field2 = field3;
/* 272 */                       z = true;
                            }
                        }
/* 273 */               i2++;
/* 269 */               field2 = null;
                        break;
                    }
/* 280 */           if (field2 == null) {
/* 282 */               kSerializer2 = null;
                    } else {
/* 284 */               Object obj2 = field2.get(null);
/* 288 */               Method[] methods = clsM10224s.getMethods();
/* 292 */               methods.getClass();
/* 295 */               int length3 = methods.length;
/* 296 */               Method method = null;
/* 297 */               int i3 = 0;
/* 298 */               boolean z2 = false;
                        while (true) {
/* 299 */                   if (i3 >= length3) {
/* 343 */                       if (!z2) {
                                    break;
                                }
                                break;
                            }
/* 301 */                   Method method2 = methods[i3];
/* 311 */                   if (Intrinsics.m6216a(method2.getName(), "serializer")) {
/* 313 */                       Class<?>[] parameterTypes = method2.getParameterTypes();
/* 317 */                       parameterTypes.getClass();
/* 321 */                       if (parameterTypes.length == 0 && Intrinsics.m6216a(method2.getReturnType(), KSerializer.class)) {
/* 333 */                           if (!z2) {
/* 337 */                               method = method2;
/* 338 */                               z2 = true;
                                    }
                                }
                            }
/* 339 */                   i3++;
/* 335 */                   method = null;
                            break;
                        }
/* 346 */               if (method == null) {
/* 282 */                   kSerializer2 = null;
                        } else {
/* 349 */                   Object objInvoke2 = method.invoke(obj2, null);
/* 355 */                   if (objInvoke2 instanceof KSerializer) {
/* 357 */                       kSerializer2 = (KSerializer) objInvoke2;
                            } else {
/* 282 */                       kSerializer2 = null;
                            }
                        }
                    }
/* 359 */           if (kSerializer2 != null) {
/* 470 */               return kSerializer2;
                    }
                    try {
/* 363 */               Class<?>[] declaredClasses = clsM10224s.getDeclaredClasses();
/* 367 */               declaredClasses.getClass();
/* 370 */               int length4 = declaredClasses.length;
/* 371 */               Class<?> cls = null;
/* 372 */               boolean z3 = false;
/* 373 */               int i4 = 0;
                        while (true) {
/* 374 */                   if (i4 >= length4) {
/* 399 */                       if (!z3) {
                                }
/* 424 */                       if (kSerializer3 != null) {
/* 470 */                           return kSerializer3;
                                }
/* 431 */                       if (clsM10224s.getAnnotation(kt1.class) == null || ((da2Var = (da2) clsM10224s.getAnnotation(da2.class)) != null && j22.m5667a(da2Var.with()).equals(j22.m5667a(mt1.class)))) {
/* 466 */                           mt1Var = new mt1(j22.m5667a(clsM10224s));
                                }
/* 469 */                       return mt1Var;
                            }
/* 376 */                   Class<?> cls2 = declaredClasses[i4];
/* 388 */                   if (cls2.getSimpleName().equals("$serializer")) {
/* 390 */                       if (!z3) {
/* 394 */                           cls = cls2;
/* 395 */                           z3 = true;
                                }
                            }
/* 396 */                   i4++;
/* 392 */                   cls = null;
                            break;
                        }
/* 415 */               Object obj3 = (cls == null || (field = cls.getField("INSTANCE")) == null) ? null : field.get(null);
/* 423 */               kSerializer3 = obj3 instanceof KSerializer ? (KSerializer) obj3 : null;
                    } catch (NoSuchFieldException unused3) {
                    }
/* 424 */           if (kSerializer3 != null) {
/* 470 */               return kSerializer3;
                    }
/* 431 */           if (clsM10224s.getAnnotation(kt1.class) == null) {
/* 466 */               mt1Var = new mt1(j22.m5667a(clsM10224s));
                    } else {
/* 466 */               mt1Var = new mt1(j22.m5667a(clsM10224s));
                    }
/* 469 */           return mt1Var;
                }

                /* JADX INFO: renamed from: i */
                public static C2197sx m4432i(String str, String str2) {
/* 3 */             C2549zf c2549zf = new C2549zf(str, str2);
/* 8 */             C2160rx c2160rxM8644b = C2197sx.m8644b(C2549zf.class);
/* 13 */            c2160rxM8644b.f16333e = 1;
/* 21 */            c2160rxM8644b.f16334f = new C2123qx(c2549zf, 0);
/* 23 */            return c2160rxM8644b.m8315b();
                }

                /* JADX INFO: renamed from: j */
                public static C1822k8 m4433j(int i, int i2, int i3, int i4) {
/* 7 */             return new C1822k8(ImageReader.newInstance(i, i2, i3, i4));
                }

                /* JADX INFO: renamed from: k */
                public static String m4434k(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return j13.m5641a("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return j13.m5641a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 45 */            C1951n4.m6859j(fm0.m3781g(i2, "negative size: "));
/* 48 */            return null;
                }

                /* JADX INFO: renamed from: m */
                public static SafeParcelable m4435m(Intent intent, String str, Parcelable.Creator creator) {
/* 1 */             byte[] byteArrayExtra = intent.getByteArrayExtra(str);
/* 5 */             if (byteArrayExtra == null) {
/* 7 */                 return null;
                    }
/* 9 */             kb1.m6061n(creator);
/* 12 */            Parcel parcelObtain = Parcel.obtain();
/* 18 */            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
/* 21 */            parcelObtain.setDataPosition(0);
/* 28 */            SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
/* 30 */            parcelObtain.recycle();
/* 33 */            return safeParcelable;
                }

                /* JADX INFO: renamed from: n */
                public static void m4436n(Canvas canvas, boolean z) {
                    Method method;
/* 3 */             int i = Build.VERSION.SDK_INT;
/* 7 */             if (i >= 29) {
/* 9 */                 if (z) {
/* 1 */                     canvas.enableZ();
/* 14 */                    return;
                        } else {
/* 1 */                     canvas.disableZ();
/* 18 */                    return;
                        }
                    }
/* 21 */            if (i == 28) {
/* 83 */                f42.m3656l("This method doesn't work on Pie!");
/* 86 */                return;
                    }
/* 26 */            if (!f9409l) {
                        try {
/* 31 */                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
/* 35 */                    f9407j = declaredMethod;
/* 37 */                    declaredMethod.setAccessible(true);
/* 42 */                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
/* 46 */                    f9408k = declaredMethod2;
/* 48 */                    declaredMethod2.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
/* 51 */                f9409l = true;
                    }
/* 53 */            if (z) {
                        try {
/* 55 */                    Method method2 = f9407j;
/* 57 */                    if (method2 != null) {
/* 59 */                        method2.invoke(canvas, null);
                            }
                        } catch (IllegalAccessException unused2) {
/* 80 */                    return;
                        } catch (InvocationTargetException e) {
/* 77 */                    ds0.m3199p(e.getCause());
/* 80 */                    return;
                        }
                    }
/* 62 */            if (z || (method = f9408k) == null) {
/* 80 */                return;
                    }
/* 68 */            method.invoke(canvas, null);
                }

                /* JADX INFO: renamed from: p */
                public static C2197sx m4437p(String str, s80 s80Var) {
/* 3 */             C2160rx c2160rxM8644b = C2197sx.m8644b(C2549zf.class);
/* 8 */             c2160rxM8644b.f16333e = 1;
/* 16 */            c2160rxM8644b.m8314a(r70.m8078a(Context.class));
/* 25 */            c2160rxM8644b.f16334f = new C2076pn(5, str, s80Var);
/* 27 */            return c2160rxM8644b.m8315b();
                }

                /* JADX INFO: renamed from: q */
                public static C1020i9 m4438q(Status status) {
                    return status.f3447c != null ? new t32(status) : new C1020i9(status);
                }

                /* JADX INFO: renamed from: r */
                public static SharedPreferences m4439r(Context context) {
/* 23 */            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
                }

                /* JADX INFO: renamed from: s */
                public static boolean m4440s(int i, Rect rect, Rect rect2) {
/* 4 */             if (i == 17) {
/* 75 */                int i2 = rect.right;
/* 77 */                int i3 = rect2.right;
/* 79 */                if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
/* 91 */                    return true;
                        }
                    } else if (i == 33) {
/* 58 */                int i4 = rect.bottom;
/* 60 */                int i5 = rect2.bottom;
/* 62 */                if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
/* 91 */                    return true;
                        }
                    } else if (i == 66) {
/* 41 */                int i6 = rect.left;
/* 43 */                int i7 = rect2.left;
/* 45 */                if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
/* 91 */                    return true;
                        }
                    } else {
/* 16 */                if (i != 130) {
/* 37 */                    C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 3 */                     return false;
                        }
/* 18 */                int i8 = rect.top;
/* 20 */                int i9 = rect2.top;
/* 22 */                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
/* 91 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: u */
                public static boolean m4441u(Context context) {
/* 1 */             PackageManager packageManager = context.getPackageManager();
/* 7 */             if (f9410m == null) {
/* 19 */                f9410m = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    }
/* 23 */            return f9410m.booleanValue();
                }

                /* JADX INFO: renamed from: v */
                public static boolean m4442v(Context context) {
/* 1 */             m4441u(context);
/* 6 */             if (f9411n == null) {
/* 22 */                f9411n = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
                    }
/* 30 */            if (f9411n.booleanValue()) {
                        return !j13.m5650l() || Build.VERSION.SDK_INT >= 30;
                    }
/* 46 */            return false;
                }

                /* JADX INFO: renamed from: w */
                public static ig2 m4443w(y10 y10Var, kt0 kt0Var, Function2 function2, int i) {
                    CoroutineContext coroutineContext = kt0Var;
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 coroutineContext = C1846g.f12919a;
                    }
/* 7 */             b20 b20Var = b20.f2175a;
/* 9 */             CoroutineContext coroutineContextM5653o = j13.m5653o(y10Var, coroutineContext);
/* 13 */            b20 b20Var2 = b20.f2175a;
/* 17 */            ig2 ig2Var = new ig2(coroutineContextM5653o, true);
/* 20 */            ig2Var.m4405W(b20Var, ig2Var, function2);
/* 23 */            return ig2Var;
                }

                /* JADX INFO: renamed from: x */
                public static String m4444x(String str, Object... objArr) {
                    int iIndexOf;
                    String string;
/* 1 */             int i = 0;
/* 4 */             for (int i2 = 0; i2 < objArr.length; i2++) {
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    string = "null";
                        } else {
                            try {
/* 14 */                        string = obj.toString();
                            } catch (Exception e) {
/* 25 */                        String name = obj.getClass().getName();
/* 33 */                        String hexString = Integer.toHexString(System.identityHashCode(obj));
/* 54 */                        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
/* 57 */                        sb.append(name);
/* 62 */                        sb.append('@');
/* 65 */                        sb.append(hexString);
/* 68 */                        String string2 = sb.toString();
/* 98 */                        Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e);
/* 105 */                       String name2 = e.getClass().getName();
/* 122 */                       StringBuilder sb2 = new StringBuilder(name2.length() + string2.length() + 9);
/* 127 */                       sb2.append("<");
/* 130 */                       sb2.append(string2);
/* 135 */                       sb2.append(" threw ");
/* 138 */                       sb2.append(name2);
/* 143 */                       sb2.append(">");
/* 146 */                       string = sb2.toString();
                            }
                        }
/* 150 */               objArr[i2] = string;
                    }
/* 166 */           StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
/* 169 */           int i3 = 0;
/* 171 */           while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
/* 183 */               sb3.append((CharSequence) str, i3, iIndexOf);
/* 190 */               sb3.append(objArr[i]);
/* 193 */               i3 = iIndexOf + 2;
/* 186 */               i++;
                    }
/* 203 */           sb3.append((CharSequence) str, i3, str.length());
/* 207 */           if (i < objArr.length) {
/* 211 */               sb3.append(" [");
/* 218 */               sb3.append(objArr[i]);
/* 222 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 226 */                   sb3.append(", ");
/* 233 */                   sb3.append(objArr[i4]);
                        }
/* 240 */               sb3.append(']');
                    }
/* 243 */           return sb3.toString();
                }

                /* JADX INFO: renamed from: y */
                public static int m4445y(int i, Rect rect, Rect rect2) {
                    int i2;
                    int i3;
/* 4 */             if (i == 17) {
/* 40 */                i2 = rect.left;
/* 42 */                i3 = rect2.right;
                    } else if (i == 33) {
/* 35 */                i2 = rect.top;
/* 37 */                i3 = rect2.bottom;
                    } else if (i == 66) {
/* 30 */                i2 = rect2.left;
/* 32 */                i3 = rect.right;
                    } else {
/* 16 */                if (i != 130) {
/* 26 */                    C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 3 */                     return 0;
                        }
/* 18 */                i2 = rect2.top;
/* 20 */                i3 = rect.bottom;
                    }
/* 45 */            return Math.max(0, i2 - i3);
                }

                /* JADX INFO: renamed from: z */
                public static int m4446z(int i, Rect rect, Rect rect2) {
/* 3 */             if (i != 17) {
/* 7 */                 if (i != 33) {
/* 11 */                    if (i != 66) {
/* 15 */                        if (i != 130) {
/* 20 */                            C1951n4.m6859j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
/* 23 */                            return 0;
                                }
                            }
                        }
/* 44 */                return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
                    }
/* 68 */            return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
                }

                /* JADX WARN: Code duplicated, block: B:106:0x0063 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:20:0x0049  */
                /* JADX WARN: Code duplicated, block: B:24:0x0056  */
                /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:31:0x006c  */
                /* JADX WARN: Code duplicated, block: B:44:0x009a  */
                /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
                /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
                /* JADX WARN: Code duplicated, block: B:80:0x0066 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:83:0x004f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:84:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:85:0x008d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:86:0x00d8 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:87:0x00d3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:92:0x006a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:96:0x0096 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:97:0x0131 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:98:0x012c A[SYNTHETIC] */
                /* JADX INFO: renamed from: l */
                public final String m4447l(byte[] bArr, int i, int i2) throws pz0 {
                    int i3;
                    byte b;
                    int i4;
                    byte b2;
                    byte b3;
                    byte b4;
                    switch (this.f9414a) {
                        case 0:
/* 49 */                    if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
/* 336 */                       C1697u2.m5440p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
/* 339 */                       return null;
                            }
/* 51 */                    int i5 = i + i2;
/* 53 */                    char[] cArr = new char[i2];
/* 56 */                    int i6 = 0;
/* 57 */                    while (i < i5) {
/* 59 */                        byte b5 = bArr[i];
/* 61 */                        if (b5 < 0) {
/* 72 */                            while (i < i5) {
/* 74 */                                i3 = i + 1;
/* 76 */                                b = bArr[i];
/* 78 */                                if (b < 0) {
/* 80 */                                    i4 = i6 + 1;
/* 83 */                                    cArr[i6] = (char) b;
/* 85 */                                    while (i3 < i5) {
/* 87 */                                        b2 = bArr[i3];
/* 89 */                                        if (b2 >= 0) {
/* 91 */                                            i3++;
/* 96 */                                            cArr[i4] = (char) b2;
/* 93 */                                            i4++;
                                                } else {
/* 100 */                                           i6 = i4;
/* 101 */                                           i = i3;
                                                }
                                            }
/* 100 */                                   i6 = i4;
/* 101 */                                   i = i3;
                                        } else if (b < -32) {
/* 107 */                                   if (i3 < i5) {
/* 146 */                                       throw pz0.m7623b();
                                            }
/* 109 */                                   i += 2;
/* 111 */                                   byte b6 = bArr[i3];
/* 113 */                                   int i7 = i6 + 1;
/* 117 */                                   if (b >= -62 || qj3.m7913x(b6)) {
/* 141 */                                       throw pz0.m7623b();
                                            }
/* 133 */                                   cArr[i6] = (char) ((b6 & Utf8.REPLACEMENT_BYTE) | ((b & 31) << 6));
/* 135 */                                   i6 = i7;
                                        } else {
/* 149 */                                   if (b >= -16) {
/* 219 */                                       if (i3 < i5 - 2) {
/* 310 */                                           throw pz0.m7623b();
                                                }
/* 223 */                                       b4 = bArr[i3];
/* 225 */                                       int i8 = i + 3;
/* 227 */                                       byte b7 = bArr[i + 2];
/* 229 */                                       i += 4;
/* 231 */                                       byte b8 = bArr[i8];
/* 233 */                                       int i9 = i6 + 1;
/* 239 */                                       if (!qj3.m7913x(b4)) {
/* 248 */                                           if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !qj3.m7913x(b7) && !qj3.m7913x(b8)) {
/* 278 */                                               int i10 = ((b4 & Utf8.REPLACEMENT_BYTE) << 12) | ((b & 7) << 18) | ((b7 & Utf8.REPLACEMENT_BYTE) << 6) | (b8 & Utf8.REPLACEMENT_BYTE);
/* 286 */                                               cArr[i6] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
/* 295 */                                               cArr[i9] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
/* 297 */                                               i6 += 2;
                                                    }
                                                }
/* 305 */                                       throw pz0.m7623b();
                                            }
/* 153 */                                   if (i3 < i5 - 1) {
/* 216 */                                       throw pz0.m7623b();
                                            }
/* 155 */                                   int i11 = i + 2;
/* 157 */                                   b3 = bArr[i3];
/* 159 */                                   i += 3;
/* 161 */                                   byte b9 = bArr[i11];
/* 163 */                                   int i12 = i6 + 1;
/* 169 */                                   if (!qj3.m7913x(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || qj3.m7913x(b9)))) {
/* 211 */                                       throw pz0.m7623b();
                                            }
/* 202 */                                   cArr[i6] = (char) (((b3 & Utf8.REPLACEMENT_BYTE) << 6) | ((b & 15) << 12) | (b9 & Utf8.REPLACEMENT_BYTE));
/* 204 */                                   i6 = i12;
                                        }
                                    }
/* 313 */                           return new String(cArr, 0, i6);
                                }
/* 63 */                        i++;
/* 68 */                        cArr[i6] = (char) b5;
/* 65 */                        i6++;
                            }
/* 72 */                    while (i < i5) {
/* 74 */                        i3 = i + 1;
/* 76 */                        b = bArr[i];
/* 78 */                        if (b < 0) {
/* 105 */                           if (b < -32) {
/* 107 */                               if (i3 < i5) {
/* 146 */                                   throw pz0.m7623b();
                                        }
/* 109 */                               i += 2;
/* 111 */                               byte b10 = bArr[i3];
/* 113 */                               int i13 = i6 + 1;
/* 117 */                               if (b >= -62) {
                                        }
/* 141 */                               throw pz0.m7623b();
                                    }
/* 149 */                           if (b >= -16) {
/* 153 */                               if (i3 < i5 - 1) {
/* 216 */                                   throw pz0.m7623b();
                                        }
/* 155 */                               int i14 = i + 2;
/* 157 */                               b3 = bArr[i3];
/* 159 */                               i += 3;
/* 161 */                               byte b11 = bArr[i14];
/* 163 */                               int i15 = i6 + 1;
/* 169 */                               if (qj3.m7913x(b3)) {
                                        }
/* 211 */                               throw pz0.m7623b();
                                    }
/* 219 */                           if (i3 < i5 - 2) {
/* 310 */                               throw pz0.m7623b();
                                    }
/* 223 */                           b4 = bArr[i3];
/* 225 */                           int i16 = i + 3;
/* 227 */                           byte b12 = bArr[i + 2];
/* 229 */                           i += 4;
/* 231 */                           byte b13 = bArr[i16];
/* 233 */                           int i17 = i6 + 1;
/* 239 */                           if (!qj3.m7913x(b4)) {
/* 248 */                               if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                                        }
                                    }
/* 305 */                           throw pz0.m7623b();
                                }
/* 80 */                        i4 = i6 + 1;
/* 83 */                        cArr[i6] = (char) b;
/* 85 */                        while (i3 < i5) {
/* 87 */                            b2 = bArr[i3];
/* 89 */                            if (b2 >= 0) {
/* 91 */                                i3++;
/* 96 */                                cArr[i4] = (char) b2;
/* 93 */                                i4++;
                                    } else {
/* 100 */                               i6 = i4;
/* 101 */                               i = i3;
                                    }
                                }
/* 100 */                       i6 = i4;
/* 101 */                       i = i3;
                            }
/* 313 */                   return new String(cArr, 0, i6);
                        default:
/* 8 */                     Charset charset = ez0.f7923a;
/* 10 */                    String str = new String(bArr, i, i2, charset);
/* 19 */                    if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
/* 42 */                        throw pz0.m7623b();
                            }
/* 37 */                    return str;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:104:0x023c  */
                /* JADX WARN: Code duplicated, block: B:129:0x0237 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:130:0x022f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:131:0x022e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:71:0x0183  */
                /* JADX WARN: Code duplicated, block: B:72:0x0187  */
                /* JADX WARN: Code duplicated, block: B:74:0x018a  */
                /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
                /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
                /* JADX WARN: Code duplicated, block: B:86:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
                /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
                /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
                /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
                /* JADX INFO: renamed from: o */
                public final int m4448o(String str, byte[] bArr, int i, int i2) {
                    int i3;
                    char cCharAt;
                    int i4;
                    int i5;
                    char cCharAt2;
                    char cCharAt3;
                    int i6;
                    int i7;
                    char cCharAt4;
/* 13 */            char c = 2048;
/* 15 */            char c2 = 128;
/* 17 */            char c3 = 55296;
                    switch (this.f9414a) {
                        case 0:
/* 360 */                   int length = str.length();
/* 364 */                   int i8 = i2 + i;
/* 365 */                   int i9 = 0;
/* 366 */                   while (i9 < length) {
/* 368 */                       int i10 = i9 + i;
/* 370 */                       if (i10 >= i8 || (cCharAt3 = str.charAt(i9)) >= 128) {
/* 386 */                           if (i9 == length) {
/* 388 */                               return i + length;
                                    }
/* 392 */                           i3 = i + i9;
/* 393 */                           while (i9 < length) {
/* 395 */                               cCharAt = str.charAt(i9);
/* 401 */                               if (cCharAt >= 128 && i3 < i8) {
/* 408 */                                   bArr[i3] = (byte) cCharAt;
/* 405 */                                   i3++;
                                        } else if (cCharAt < 2048 || i3 > i8 - 2) {
/* 448 */                                   if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
/* 491 */                                       if (i3 > i8 - 4) {
/* 571 */                                           if (55296 > cCharAt && cCharAt <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
/* 602 */                                               throw new k13(i9, length);
                                                    }
/* 603 */                                           pk3.m7473i(cCharAt, i3);
/* 606 */                                           return 0;
                                                }
/* 493 */                                       i5 = i9 + 1;
/* 499 */                                       if (i5 != str.length()) {
/* 501 */                                           cCharAt2 = str.charAt(i5);
/* 509 */                                           if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                               int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                               bArr[i3] = (byte) ((codePoint >>> 18) | 240);
/* 534 */                                               bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
/* 536 */                                               int i11 = i3 + 3;
/* 544 */                                               bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
/* 546 */                                               i3 += 4;
/* 552 */                                               bArr[i11] = (byte) ((codePoint & 63) | 128);
/* 554 */                                               i9 = i5;
                                                    } else {
/* 559 */                                               i9 = i5;
                                                    }
                                                }
/* 567 */                                       throw new k13(i9 - 1, length);
                                            }
/* 466 */                                   bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                                   int i12 = i3 + 2;
/* 478 */                                   bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                                   i3 += 3;
/* 486 */                                   bArr[i12] = (byte) ((cCharAt & '?') | 128);
/* 555 */                                   i9++;
                                        } else {
/* 425 */                                   int i13 = i3 + 1;
/* 432 */                                   bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
/* 434 */                                   i3 += 2;
/* 442 */                                   bArr[i13] = (byte) ((cCharAt & '?') | 128);
                                        }
/* 555 */                               i9++;
                                    }
/* 608 */                           return i3;
                                }
/* 381 */                       bArr[i10] = (byte) cCharAt3;
/* 383 */                       i9++;
                            }
/* 386 */                   if (i9 == length) {
/* 388 */                       return i + length;
                            }
/* 392 */                   i3 = i + i9;
/* 393 */                   while (i9 < length) {
/* 395 */                       cCharAt = str.charAt(i9);
/* 401 */                       if (cCharAt >= 128) {
/* 419 */                           if (cCharAt < 2048) {
/* 448 */                               if (cCharAt < 55296) {
/* 466 */                                   bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                                   int i14 = i3 + 2;
/* 478 */                                   bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                                   i3 += 3;
/* 486 */                                   bArr[i14] = (byte) ((cCharAt & '?') | 128);
                                        } else {
/* 466 */                                   bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                                   int i15 = i3 + 2;
/* 478 */                                   bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                                   i3 += 3;
/* 486 */                                   bArr[i15] = (byte) ((cCharAt & '?') | 128);
                                        }
/* 491 */                               if (i3 > i8 - 4) {
/* 571 */                                   if (55296 > cCharAt) {
                                            }
/* 603 */                                   pk3.m7473i(cCharAt, i3);
/* 606 */                                   return 0;
                                        }
/* 493 */                               i5 = i9 + 1;
/* 499 */                               if (i5 != str.length()) {
/* 501 */                                   cCharAt2 = str.charAt(i5);
/* 509 */                                   if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                       int codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                       bArr[i3] = (byte) ((codePoint2 >>> 18) | 240);
/* 534 */                                       bArr[i3 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
/* 536 */                                       int i16 = i3 + 3;
/* 544 */                                       bArr[i3 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
/* 546 */                                       i3 += 4;
/* 552 */                                       bArr[i16] = (byte) ((codePoint2 & 63) | 128);
/* 554 */                                       i9 = i5;
                                            } else {
/* 559 */                                       i9 = i5;
                                            }
                                        }
/* 567 */                               throw new k13(i9 - 1, length);
                                    }
/* 448 */                           if (cCharAt < 55296) {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i17 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i17] = (byte) ((cCharAt & '?') | 128);
                                    } else {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i18 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i18] = (byte) ((cCharAt & '?') | 128);
                                    }
/* 491 */                           if (i3 > i8 - 4) {
/* 571 */                               if (55296 > cCharAt) {
                                        }
/* 603 */                               pk3.m7473i(cCharAt, i3);
/* 606 */                               return 0;
                                    }
/* 493 */                           i5 = i9 + 1;
/* 499 */                           if (i5 != str.length()) {
/* 501 */                               cCharAt2 = str.charAt(i5);
/* 509 */                               if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                   int codePoint3 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                   bArr[i3] = (byte) ((codePoint3 >>> 18) | 240);
/* 534 */                                   bArr[i3 + 1] = (byte) (((codePoint3 >>> 12) & 63) | 128);
/* 536 */                                   int i19 = i3 + 3;
/* 544 */                                   bArr[i3 + 2] = (byte) (((codePoint3 >>> 6) & 63) | 128);
/* 546 */                                   i3 += 4;
/* 552 */                                   bArr[i19] = (byte) ((codePoint3 & 63) | 128);
/* 554 */                                   i9 = i5;
                                        } else {
/* 559 */                                   i9 = i5;
                                        }
                                    }
/* 567 */                           throw new k13(i9 - 1, length);
                                }
/* 419 */                       if (cCharAt < 2048) {
/* 448 */                           if (cCharAt < 55296) {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i110 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i110] = (byte) ((cCharAt & '?') | 128);
                                    } else {
/* 466 */                               bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                               int i111 = i3 + 2;
/* 478 */                               bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                               i3 += 3;
/* 486 */                               bArr[i111] = (byte) ((cCharAt & '?') | 128);
                                    }
/* 491 */                           if (i3 > i8 - 4) {
/* 571 */                               if (55296 > cCharAt) {
                                        }
/* 603 */                               pk3.m7473i(cCharAt, i3);
/* 606 */                               return 0;
                                    }
/* 493 */                           i5 = i9 + 1;
/* 499 */                           if (i5 != str.length()) {
/* 501 */                               cCharAt2 = str.charAt(i5);
/* 509 */                               if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                                   int codePoint4 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                                   bArr[i3] = (byte) ((codePoint4 >>> 18) | 240);
/* 534 */                                   bArr[i3 + 1] = (byte) (((codePoint4 >>> 12) & 63) | 128);
/* 536 */                                   int i112 = i3 + 3;
/* 544 */                                   bArr[i3 + 2] = (byte) (((codePoint4 >>> 6) & 63) | 128);
/* 546 */                                   i3 += 4;
/* 552 */                                   bArr[i112] = (byte) ((codePoint4 & 63) | 128);
/* 554 */                                   i9 = i5;
                                        } else {
/* 559 */                                   i9 = i5;
                                        }
                                    }
/* 567 */                           throw new k13(i9 - 1, length);
                                }
/* 448 */                       if (cCharAt < 55296) {
/* 466 */                           bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                           int i113 = i3 + 2;
/* 478 */                           bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                           i3 += 3;
/* 486 */                           bArr[i113] = (byte) ((cCharAt & '?') | 128);
                                } else {
/* 466 */                           bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
/* 468 */                           int i114 = i3 + 2;
/* 478 */                           bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
/* 480 */                           i3 += 3;
/* 486 */                           bArr[i114] = (byte) ((cCharAt & '?') | 128);
                                }
/* 491 */                       if (i3 > i8 - 4) {
/* 571 */                           if (55296 > cCharAt) {
                                    }
/* 603 */                           pk3.m7473i(cCharAt, i3);
/* 606 */                           return 0;
                                }
/* 493 */                       i5 = i9 + 1;
/* 499 */                       if (i5 != str.length()) {
/* 501 */                           cCharAt2 = str.charAt(i5);
/* 509 */                           if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
/* 511 */                               int codePoint5 = Character.toCodePoint(cCharAt, cCharAt2);
/* 522 */                               bArr[i3] = (byte) ((codePoint5 >>> 18) | 240);
/* 534 */                               bArr[i3 + 1] = (byte) (((codePoint5 >>> 12) & 63) | 128);
/* 536 */                               int i115 = i3 + 3;
/* 544 */                               bArr[i3 + 2] = (byte) (((codePoint5 >>> 6) & 63) | 128);
/* 546 */                               i3 += 4;
/* 552 */                               bArr[i115] = (byte) ((codePoint5 & 63) | 128);
/* 554 */                               i9 = i5;
                                    } else {
/* 559 */                               i9 = i5;
                                    }
                                }
/* 567 */                       throw new k13(i9 - 1, length);
/* 555 */                       i9++;
                            }
/* 608 */                   return i3;
                        default:
                            long j = i;
/* 25 */                    long j2 = ((long) i2) + j;
/* 26 */                    int length2 = str.length();
/* 34 */                    if (length2 > i2 || bArr.length - i2 < i) {
/* 359 */                       throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                            }
/* 40 */                    int i20 = 0;
/* 43 */                    while (i20 < length2 && (cCharAt4 = str.charAt(i20)) < 128) {
/* 54 */                        my2.m6825k(bArr, j, (byte) cCharAt4);
/* 57 */                        i20++;
/* 51 */                        j++;
                            }
/* 62 */                    if (i20 != length2) {
/* 67 */                        while (i20 < length2) {
/* 69 */                            char cCharAt5 = str.charAt(i20);
/* 73 */                            if (cCharAt5 >= c2 || j >= j2) {
/* 91 */                                if (cCharAt5 >= c || j > j2 - 2) {
/* 122 */                                   i6 = i20;
/* 125 */                                   if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
/* 187 */                                       if (j > j2 - 4) {
/* 277 */                                           if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i7 = i6 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i7)))) {
/* 303 */                                               throw new k13(i6, length2);
                                                    }
/* 327 */                                           throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                                }
/* 189 */                                       i20 = i6 + 1;
/* 191 */                                       if (i20 != length2) {
/* 193 */                                           char cCharAt6 = str.charAt(i20);
/* 201 */                                           if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
/* 203 */                                               int codePoint6 = Character.toCodePoint(cCharAt5, cCharAt6);
/* 214 */                                               my2.m6825k(bArr, j, (byte) ((codePoint6 >>> 18) | 240));
/* 231 */                                               my2.m6825k(bArr, j + 1, (byte) (((codePoint6 >>> 12) & 63) | 128));
/* 234 */                                               long j3 = j + 3;
/* 242 */                                               my2.m6825k(bArr, j + 2, (byte) (((codePoint6 >>> 6) & 63) | 128));
/* 245 */                                               j += 4;
/* 251 */                                               my2.m6825k(bArr, j3, (byte) ((codePoint6 & 63) | 128));
                                                    }
                                                } else {
/* 265 */                                           i20 = i6;
                                                }
/* 273 */                                       throw new k13(i20 - 1, length2);
                                            }
/* 151 */                                   my2.m6825k(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
/* 156 */                                   long j4 = j + 2;
/* 166 */                                   my2.m6825k(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | c2));
/* 169 */                                   j += 3;
/* 177 */                                   my2.m6825k(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                                        } else {
/* 99 */                                    i6 = i20;
/* 100 */                                   long j5 = j + 1;
/* 107 */                                   my2.m6825k(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
/* 110 */                                   j += 2;
/* 116 */                                   my2.m6825k(bArr, j5, (byte) ((cCharAt5 & '?') | c2));
                                        }
/* 119 */                               i20 = i6;
                                    } else {
/* 82 */                                my2.m6825k(bArr, j, (byte) cCharAt5);
/* 79 */                                j++;
                                    }
/* 254 */                           i20++;
/* 256 */                           c = 2048;
/* 258 */                           c2 = 128;
/* 260 */                           c3 = 55296;
                                }
                            }
/* 64 */                    return (int) j;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:122:0x0097 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:123:0x00b2 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:124:0x018e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:125:0x0105 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:126:0x0105 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:127:0x009f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:128:0x00d9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:129:0x00b9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:134:0x0105 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:135:0x0105 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:136:0x0105 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:137:0x0105 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:138:0x00b6 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:139:0x00dc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:141:0x0084 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:37:0x009b  */
                /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
                /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
                /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
                /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
                /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
                /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [int] */
                /* JADX WARN: Type inference failed for: r5v1, types: [int] */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v13, types: [int] */
                /* JADX WARN: Type inference failed for: r5v14, types: [int] */
                /* JADX WARN: Type inference failed for: r5v16, types: [int] */
                /* JADX WARN: Type inference failed for: r5v2, types: [int] */
                /* JADX WARN: Type inference failed for: r5v21, types: [byte] */
                /* JADX WARN: Type inference failed for: r5v22 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX INFO: renamed from: t */
                public boolean m4449t(byte[] bArr, int i, int i2) {
                    boolean z;
                    ?? M6589a;
                    long j;
                    int i3;
                    int i4;
                    long j2;
                    byte bM6821g;
                    long j3;
                    byte bM6821g2;
                    long j4;
/* 3 */             int i5 = i;
                    switch (this.f9414a) {
                        case 0:
/* 291 */                   z = false;
/* 293 */                   while (i5 < i2 && bArr[i5] >= 0) {
/* 299 */                       i5++;
                            }
/* 302 */                   if (i5 >= i2) {
/* 152 */                       M6589a = z;
                            } else {
                                while (true) {
/* 305 */                           if (i5 >= i2) {
/* 152 */                               M6589a = z;
                                    } else {
/* 309 */                               int i6 = i5 + 1;
/* 311 */                               M6589a = bArr[i5];
/* 313 */                               if (M6589a >= 0) {
/* 404 */                                   i5 = i6;
                                        } else if (M6589a >= -32) {
/* 329 */                                   if (M6589a >= -16) {
/* 363 */                                       if (i6 < i2 - 2) {
/* 370 */                                           int i7 = i5 + 2;
/* 372 */                                           int i8 = bArr[i6];
/* 374 */                                           if (i8 <= -65) {
/* 383 */                                               if ((((i8 + 112) + (M6589a << 28)) >> 30) == 0) {
/* 385 */                                                   int i9 = i5 + 3;
/* 389 */                                                   if (bArr[i7] <= -65) {
/* 391 */                                                       i5 += 4;
/* 395 */                                                       if (bArr[i9] > -65) {
                                                                }
                                                            }
                                                        }
                                                    }
/* 262 */                                           M6589a = -1;
                                                } else {
/* 365 */                                           M6589a = m13.m6589a(bArr, i6, i2);
                                                }
                                            } else if (i6 < i2 - 1) {
/* 340 */                                       int i10 = i5 + 2;
/* 342 */                                       byte b = bArr[i6];
/* 344 */                                       if (b <= -65 && ((M6589a != -32 || b >= -96) && (M6589a != -19 || b < -96))) {
/* 354 */                                           i5 += 3;
/* 358 */                                           if (bArr[i10] > -65) {
                                                    }
                                                }
/* 262 */                                       M6589a = -1;
                                            } else {
/* 335 */                                       M6589a = m13.m6589a(bArr, i6, i2);
                                            }
                                        } else if (i6 < i2) {
/* 320 */                                   if (M6589a >= -62) {
/* 322 */                                       i5 += 2;
/* 326 */                                       if (bArr[i6] > -65) {
                                                }
                                            }
/* 262 */                                   M6589a = -1;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
/* 31 */                    if ((i5 | i2 | (bArr.length - i2)) >= 0) {
                                long j5 = i5;
/* 36 */                        int i11 = (int) (((long) i2) - j5);
/* 39 */                        if (i11 < 16) {
/* 41 */                            z = false;
/* 43 */                            j = 1;
/* 45 */                            i3 = 0;
                                } else {
/* 50 */                            int i12 = 8 - (((int) j5) & 7);
/* 52 */                            long j6 = j5;
/* 53 */                            j = 1;
/* 55 */                            i3 = 0;
                                    while (true) {
/* 56 */                                if (i3 < i12) {
/* 58 */                                    long j7 = j6 + 1;
/* 64 */                                    if (my2.m6821g(bArr, j6) < 0) {
/* 66 */                                        z = false;
                                            } else {
/* 69 */                                        i3++;
/* 71 */                                        j6 = j7;
                                            }
                                        } else {
                                            while (true) {
/* 74 */                                        int i13 = i3 + 8;
/* 76 */                                        if (i13 <= i11) {
/* 82 */                                            z = false;
/* 103 */                                           if ((my2.f14064c.m6312h(bArr, my2.f14067f + j6) & (-9187201950435737472L)) == 0) {
/* 108 */                                               j6 += 8;
/* 109 */                                               i3 = i13;
                                                    }
                                                } else {
/* 112 */                                           z = false;
                                                }
                                            }
                                            while (true) {
/* 114 */                                       if (i3 < i11) {
/* 116 */                                           long j8 = j6 + 1;
/* 122 */                                           if (my2.m6821g(bArr, j6) >= 0) {
/* 125 */                                               i3++;
/* 127 */                                               j6 = j8;
                                                    }
                                                } else {
/* 129 */                                           i3 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
/* 130 */                       int i14 = i11 - i3;
/* 132 */                       long j9 = j5 + ((long) i3);
                                while (true) {
/* 133 */                           M6589a = z;
/* 135 */                           while (i14 > 0) {
/* 137 */                               long j10 = j9 + j;
/* 139 */                               M6589a = my2.m6821g(bArr, j9);
/* 143 */                               if (M6589a < 0) {
/* 149 */                                   j9 = j10;
/* 150 */                                   if (i14 == 0) {
/* 156 */                                       i4 = i14 - 1;
/* 158 */                                       if (M6589a < -32) {
/* 181 */                                           if (M6589a < -16) {
/* 219 */                                               if (i4 < 3) {
/* 227 */                                                   i14 -= 4;
/* 229 */                                                   j3 = j9 + j;
/* 231 */                                                   bM6821g2 = my2.m6821g(bArr, j9);
/* 235 */                                                   if (bM6821g2 <= -65) {
/* 244 */                                                       if ((((bM6821g2 + 112) + (M6589a << 28)) >> 30) == 0) {
/* 246 */                                                           j4 = 2 + j9;
/* 251 */                                                           if (my2.m6821g(bArr, j3) <= -65) {
/* 255 */                                                               j9 += 3;
/* 260 */                                                               if (my2.m6821g(bArr, j4) > -65) {
                                                                        }
                                                                    }
                                                                }
                                                            }
/* 262 */                                                   M6589a = -1;
                                                        } else {
/* 221 */                                                   M6589a = m4421C(bArr, M6589a, j9, i4);
                                                        }
                                                    } else if (i4 < 2) {
/* 192 */                                               i14 -= 3;
/* 194 */                                               long j11 = j9 + j;
/* 196 */                                               bM6821g = my2.m6821g(bArr, j9);
/* 200 */                                               if (bM6821g > -65 && ((M6589a != -32 || bM6821g >= -96) && (M6589a != -19 || bM6821g < -96))) {
/* 210 */                                                   j9 += 2;
/* 215 */                                                   if (my2.m6821g(bArr, j11) > -65) {
                                                            }
                                                        }
/* 262 */                                               M6589a = -1;
                                                    } else {
/* 186 */                                               M6589a = m4421C(bArr, M6589a, j9, i4);
                                                    }
                                                } else if (i4 == 0) {
/* 164 */                                           i14 -= 2;
/* 166 */                                           if (M6589a >= -62) {
/* 168 */                                               j2 = j9 + j;
/* 174 */                                               if (my2.m6821g(bArr, j9) > -65) {
/* 177 */                                                   j9 = j2;
                                                        }
                                                    }
/* 262 */                                           M6589a = -1;
                                                }
                                                break;
                                            }
                                        } else {
/* 145 */                                   i14--;
/* 147 */                                   j9 = j10;
                                            M6589a = M6589a;
                                        }
                                    }
/* 150 */                           if (i14 == 0) {
/* 156 */                               i4 = i14 - 1;
/* 158 */                               if (M6589a < -32) {
/* 181 */                                   if (M6589a < -16) {
/* 219 */                                       if (i4 < 3) {
/* 227 */                                           i14 -= 4;
/* 229 */                                           j3 = j9 + j;
/* 231 */                                           bM6821g2 = my2.m6821g(bArr, j9);
/* 235 */                                           if (bM6821g2 <= -65) {
/* 244 */                                               if ((((bM6821g2 + 112) + (M6589a << 28)) >> 30) == 0) {
/* 246 */                                                   j4 = 2 + j9;
/* 251 */                                                   if (my2.m6821g(bArr, j3) <= -65) {
/* 255 */                                                       j9 += 3;
/* 260 */                                                       if (my2.m6821g(bArr, j4) > -65) {
                                                                }
                                                            }
                                                        }
                                                    }
/* 262 */                                           M6589a = -1;
                                                } else {
/* 221 */                                           M6589a = m4421C(bArr, M6589a, j9, i4);
                                                }
                                            } else if (i4 < 2) {
/* 192 */                                       i14 -= 3;
/* 194 */                                       long j12 = j9 + j;
/* 196 */                                       bM6821g = my2.m6821g(bArr, j9);
/* 200 */                                       if (bM6821g > -65) {
                                                }
/* 262 */                                       M6589a = -1;
                                            } else {
/* 186 */                                       M6589a = m4421C(bArr, M6589a, j9, i4);
                                            }
                                        } else if (i4 == 0) {
/* 164 */                                   i14 -= 2;
/* 166 */                                   if (M6589a >= -62) {
/* 168 */                                       j2 = j9 + j;
/* 174 */                                       if (my2.m6821g(bArr, j9) > -65) {
/* 177 */                                           j9 = j2;
                                                }
                                            }
/* 262 */                                   M6589a = -1;
                                        }
                                        break;
                                    }
                                }
                            } else {
/* 265 */                       z = false;
/* 286 */                       C1697u2.m5440p("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)});
                            }
/* 152 */                   M6589a = z;
                            break;
                    }
/* 399 */           if (M6589a == 0) {
/* 401 */               return true;
                    }
/* 403 */           return z;
                }
            }
