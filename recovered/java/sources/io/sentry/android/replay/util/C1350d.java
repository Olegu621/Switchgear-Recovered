            package io.sentry.android.replay.util;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import io.sentry.android.replay.viewhierarchy.C1367e;
            import io.sentry.android.replay.viewhierarchy.C1369g;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Pair;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function1;
            import p000.b51;
            import p000.p51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1350d extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1351e f10653a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Bitmap f10654b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Matrix f10655c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ArrayList f10656d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Canvas f10657e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1350d(C1351e c1351e, Bitmap bitmap, Matrix matrix, ArrayList arrayList, Canvas canvas) {
/* 12 */            super(1);
/* 1 */             this.f10653a = c1351e;
/* 3 */             this.f10654b = bitmap;
/* 5 */             this.f10655c = matrix;
/* 7 */             this.f10656d = arrayList;
/* 9 */             this.f10657e = canvas;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Pair pair;
                    Integer numMo5034i;
                    List listM6210b;
/* 1 */             AbstractC1370h abstractC1370h = (AbstractC1370h) obj;
/* 3 */             C1351e c1351e = this.f10653a;
/* 5 */             p51 p51Var = c1351e.f10660c;
/* 7 */             p51 p51Var2 = c1351e.f10658a;
/* 9 */             abstractC1370h.getClass();
/* 12 */            boolean z = abstractC1370h.f10694d;
/* 14 */            Rect rect = abstractC1370h.f10696f;
/* 16 */            if (z && abstractC1370h.f10691a > 0 && abstractC1370h.f10692b > 0) {
/* 26 */                if (rect == null) {
/* 28 */                    return Boolean.FALSE;
                        }
/* 34 */                int iIntValue = -16777216;
/* 36 */                if (abstractC1370h instanceof C1367e) {
/* 38 */                    List listM6210b2 = C1839a.m6210b(rect);
/* 42 */                    Bitmap bitmap = this.f10654b;
/* 48 */                    if (!bitmap.isRecycled() && !((Bitmap) p51Var2.getValue()).isRecycled()) {
/* 65 */                        Rect rect2 = new Rect(rect);
/* 70 */                        RectF rectF = new RectF(rect2);
/* 73 */                        Matrix matrix = this.f10655c;
/* 75 */                        if (matrix != null) {
/* 77 */                            matrix.mapRect(rectF);
                                }
/* 80 */                        rectF.round(rect2);
/* 98 */                        ((Canvas) c1351e.f10659b.getValue()).drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
/* 107 */                       iIntValue = ((Bitmap) p51Var2.getValue()).getPixel(0, 0);
                            }
/* 117 */                   pair = new Pair(listM6210b2, Integer.valueOf(iIntValue));
                        } else if (abstractC1370h instanceof C1369g) {
/* 126 */                   C1369g c1369g = (C1369g) abstractC1370h;
/* 128 */                   InterfaceC1358l interfaceC1358l = c1369g.f10687h;
/* 138 */                   iIntValue = ((interfaceC1358l == null || (numMo5034i = interfaceC1358l.mo5034i()) == null) && (numMo5034i = c1369g.f10688i) == null) ? -16777216 : numMo5034i.intValue();
/* 148 */                   int i = c1369g.f10689j;
/* 150 */                   int i2 = c1369g.f10690k;
/* 152 */                   if (interfaceC1358l == null) {
/* 154 */                       listM6210b = C1839a.m6210b(rect);
                            } else {
/* 161 */                       ArrayList arrayList = new ArrayList();
/* 164 */                       int iMo5032f = interfaceC1358l.mo5032f();
/* 168 */                       for (int i3 = 0; i3 < iMo5032f; i3++) {
/* 174 */                           int iMo5035j = (int) interfaceC1358l.mo5035j(i3);
/* 179 */                           int iMo5033g = (int) interfaceC1358l.mo5033g(i3);
/* 180 */                           int iMo5029a = interfaceC1358l.mo5029a(i3);
/* 184 */                           int iMo5031e = interfaceC1358l.mo5031e(i3);
/* 190 */                           Rect rect3 = new Rect();
/* 197 */                           rect3.left = rect.left + i + iMo5035j;
/* 203 */                           rect3.right = rect.left + i + iMo5033g;
/* 208 */                           int i4 = rect.top + i2 + iMo5029a;
/* 209 */                           rect3.top = i4;
/* 213 */                           rect3.bottom = (iMo5031e - iMo5029a) + i4;
/* 215 */                           arrayList.add(rect3);
                                }
/* 221 */                       listM6210b = arrayList;
                            }
/* 228 */                   pair = new Pair(listM6210b, Integer.valueOf(iIntValue));
                        } else {
/* 242 */                   pair = new Pair(C1839a.m6210b(rect), -16777216);
                        }
/* 247 */               List list = (List) pair.f12908a;
/* 263 */               ((Paint) p51Var.getValue()).setColor(((Number) pair.f12909b).intValue());
/* 266 */               Iterator it = list.iterator();
/* 274 */               while (it.hasNext()) {
/* 297 */                   this.f10657e.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) p51Var.getValue());
                        }
/* 303 */               this.f10656d.addAll(list);
                    }
/* 306 */           return Boolean.TRUE;
                }
            }
