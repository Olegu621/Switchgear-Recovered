            package p000;

            import android.view.View;
            import androidx.recyclerview.widget.RecyclerView;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.location.ActivityTransition;
            import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBufferEntry;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.Comparator;
            import java.util.Map;
            import java.util.WeakHashMap;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class wa3 implements Comparator {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ wa3 f18544b = new wa3(0);

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ wa3 f18545c = new wa3(22);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18546a;

                public /* synthetic */ wa3(int i) {
/* 1 */             this.f18546a = i;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    switch (this.f18546a) {
                        case 0:
/* 504 */                   return ((Scope) obj).f3439b.compareTo(((Scope) obj2).f3439b);
                        case 1:
/* 494 */                   return ((int[]) obj)[0] - ((int[]) obj2)[0];
                        case 2:
/* 481 */                   return C1772ix.m5609a(((bv1) obj).f2616b, ((bv1) obj2).f2616b);
                        case 3:
/* 468 */                   return C1772ix.m5609a(Long.valueOf(((ConsentsBufferEntry) obj).f6110a), Long.valueOf(((ConsentsBufferEntry) obj2).f6110a));
                        case 4:
/* 429 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 431 */                   float fM8375m = s23.m8375m((View) obj);
/* 435 */                   float fM8375m2 = s23.m8375m((View) obj2);
/* 441 */                   if (fM8375m > fM8375m2) {
/* 3 */                         return -1;
                            }
                            return fM8375m < fM8375m2 ? 1 : 0;
                        case 5:
/* 420 */                   return C1772ix.m5609a(((bv1) obj).f2616b, ((bv1) obj2).f2616b);
                        case 6:
/* 358 */                   gq0 gq0Var = (gq0) obj;
/* 360 */                   gq0 gq0Var2 = (gq0) obj2;
/* 362 */                   RecyclerView recyclerView = gq0Var.f8780d;
/* 376 */                   if ((recyclerView == null) == (gq0Var2.f8780d == null)) {
/* 381 */                       boolean z = gq0Var.f8777a;
/* 385 */                       if (z == gq0Var2.f8777a) {
/* 396 */                           int i = gq0Var2.f8778b - gq0Var.f8778b;
/* 398 */                           if (i != 0) {
/* 411 */                               return i;
                                    }
/* 405 */                           int i2 = gq0Var.f8779c - gq0Var2.f8779c;
/* 407 */                           if (i2 != 0) {
/* 411 */                               return i2;
                                    }
/* 4 */                             return 0;
                                }
/* 387 */                       if (z) {
/* 3 */                             return -1;
                                }
                            } else if (recyclerView != null) {
/* 3 */                         return -1;
                            }
/* 5 */                     return 1;
                        case 7:
/* 341 */                   if (obj != null) {
/* 357 */                       throw new ClassCastException();
                            }
/* 343 */                   obj2.getClass();
/* 351 */                   throw new ClassCastException();
                        case 8:
/* 339 */                   return ((qf2) obj).f15515b - ((qf2) obj2).f15515b;
                        case 9:
/* 326 */                   return C1772ix.m5609a(((bv1) obj).f2616b, ((bv1) obj2).f2616b);
                        case 10:
/* 313 */                   return C1772ix.m5609a(((C2295vi) obj).f18188a, ((C2295vi) obj2).f18188a);
                        case 11:
/* 300 */                   return C1772ix.m5609a(((bv1) obj).f2616b, ((bv1) obj2).f2616b);
                        case 12:
/* 287 */                   return C1772ix.m5609a(Integer.valueOf(Integer.parseInt((String) obj)), Integer.valueOf(Integer.parseInt((String) obj2)));
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 265 */                   return ((View) obj).getTop() - ((View) obj2).getTop();
                        case 14:
/* 248 */                   return C1772ix.m5609a(Integer.valueOf(((TCFPurpose) obj).f6176c), Integer.valueOf(((TCFPurpose) obj2).f6176c));
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 227 */                   return C1772ix.m5609a(Integer.valueOf(((TCFSpecialFeature) obj).f6188c), Integer.valueOf(((TCFSpecialFeature) obj2).f6188c));
                        case 16:
/* 206 */                   return C1772ix.m5609a(Integer.valueOf(((TCFSpecialPurpose) obj).f6197c), Integer.valueOf(((TCFSpecialPurpose) obj2).f6197c));
                        case 17:
/* 185 */                   return C1772ix.m5609a(Integer.valueOf(((TCFStack) obj).f6201b), Integer.valueOf(((TCFStack) obj2).f6201b));
                        case 18:
/* 167 */                   return ((c43) obj).f2697b - ((c43) obj2).f2697b;
                        case 19:
/* 154 */                   return ((Scope) obj).f3439b.compareTo(((Scope) obj2).f3439b);
                        case 20:
/* 79 */                    int iM7480c = pm2.m7480c(obj);
/* 83 */                    int iM7480c2 = pm2.m7480c(obj2);
/* 87 */                    if (iM7480c != iM7480c2) {
/* 141 */                       return AbstractC0886en.m3498b(iM7480c, iM7480c2);
                            }
/* 89 */                    int iM3520y = AbstractC0886en.m3520y(iM7480c);
/* 93 */                    if (iM3520y == 0) {
/* 136 */                       return ((Boolean) obj).compareTo((Boolean) obj2);
                            }
/* 95 */                    if (iM3520y == 1) {
/* 127 */                       return ((String) obj).compareTo((String) obj2);
                            }
/* 98 */                    if (iM3520y == 2) {
/* 118 */                       return ((Long) obj).compareTo((Long) obj2);
                            }
/* 101 */                   if (iM3520y == 3) {
/* 107 */                       return ((Double) obj).compareTo((Double) obj2);
                            }
/* 113 */                   throw null;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 74 */                    return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 53 */                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                        default:
/* 9 */                     ActivityTransition activityTransition = (ActivityTransition) obj;
/* 11 */                    ActivityTransition activityTransition2 = (ActivityTransition) obj2;
/* 13 */                    kb1.m6061n(activityTransition);
/* 16 */                    kb1.m6061n(activityTransition2);
/* 19 */                    int i3 = activityTransition.f4100a;
/* 21 */                    int i4 = activityTransition2.f4100a;
/* 23 */                    if (i3 == i4) {
/* 28 */                        int i5 = activityTransition.f4101b;
/* 30 */                        int i6 = activityTransition2.f4101b;
/* 32 */                        if (i5 == i6) {
/* 4 */                             return 0;
                                }
/* 36 */                        if (i5 < i6) {
/* 3 */                             return -1;
                                }
                            } else if (i3 < i4) {
/* 3 */                         return -1;
                            }
/* 5 */                     return 1;
                    }
                }
            }
