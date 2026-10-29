            package com.quago.mobile.sdk;

            import android.graphics.PointF;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.FloatBuffer;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.j1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 285 */   public final class C0741j1 {

                /* JADX INFO: renamed from: g */
                public static final float[] f5496g;

                /* JADX INFO: renamed from: h */
                public static final FloatBuffer f5497h;

                /* JADX INFO: renamed from: i */
                public static final FloatBuffer f5498i;

                /* JADX INFO: renamed from: a */
                public FloatBuffer f5499a;

                /* JADX INFO: renamed from: b */
                public FloatBuffer f5500b;

                /* JADX INFO: renamed from: c */
                public int f5501c;

                /* JADX INFO: renamed from: d */
                public int f5502d;

                /* JADX INFO: renamed from: e */
                public int f5503e;

                /* JADX INFO: renamed from: f */
                public int f5504f;

                static {
/* 12 */            float[] fArr = AbstractC0755q.f5614a;
/* 16 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(24);
/* 24 */            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
/* 27 */            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
/* 31 */            floatBufferAsFloatBuffer.put(new float[]{0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f});
/* 35 */            floatBufferAsFloatBuffer.position(0);
/* 38 */            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(24);
/* 46 */            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
/* 49 */            FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
/* 53 */            floatBufferAsFloatBuffer2.put(new float[]{0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
/* 56 */            floatBufferAsFloatBuffer2.position(0);
/* 61 */            float[] fArr2 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
/* 66 */            f5496g = fArr2;
/* 75 */            ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(32);
/* 83 */            byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
/* 86 */            FloatBuffer floatBufferAsFloatBuffer3 = byteBufferAllocateDirect3.asFloatBuffer();
/* 90 */            floatBufferAsFloatBuffer3.put(fArr2);
/* 93 */            floatBufferAsFloatBuffer3.position(0);
/* 96 */            f5497h = floatBufferAsFloatBuffer3;
/* 98 */            ByteBuffer byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(32);
/* 106 */           byteBufferAllocateDirect4.order(ByteOrder.nativeOrder());
/* 109 */           FloatBuffer floatBufferAsFloatBuffer4 = byteBufferAllocateDirect4.asFloatBuffer();
/* 113 */           floatBufferAsFloatBuffer4.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
/* 116 */           floatBufferAsFloatBuffer4.position(0);
/* 119 */           f5498i = floatBufferAsFloatBuffer4;
                }

                /* JADX INFO: renamed from: a */
                public static C0741j1 m2618a(C0715b c0715b) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             ArrayList arrayList2 = new ArrayList();
/* 12 */            PointF pointFM2547a = c0715b.m2547a(0.0f);
/* 28 */            arrayList.add(new PointF(pointFM2547a.x, pointFM2547a.y - 0.25f));
/* 41 */            arrayList2.add(new PointF(pointFM2547a.x, pointFM2547a.y + 0.25f));
/* 47 */            for (int i = 1; i < 30; i++) {
/* 54 */                PointF pointFM2547a2 = c0715b.m2547a(0.033333335f * i);
/* 68 */                arrayList.add(new PointF(pointFM2547a2.x, pointFM2547a2.y - 0.25f));
/* 81 */                arrayList2.add(new PointF(pointFM2547a2.x, pointFM2547a2.y + 0.25f));
                    }
/* 89 */            PointF pointFM2547a3 = c0715b.m2547a(1.0f);
/* 103 */           arrayList.add(new PointF(pointFM2547a3.x, pointFM2547a3.y - 0.25f));
/* 116 */           arrayList2.add(new PointF(pointFM2547a3.x, pointFM2547a3.y + 0.25f));
/* 127 */           int size = arrayList2.size() + arrayList.size();
/* 128 */           int i2 = size * 2;
/* 130 */           float[] fArr = new float[i2];
/* 140 */           int size2 = arrayList2.size() + arrayList.size();
/* 143 */           float[] fArr2 = new float[size2 * 2];
/* 152 */           float size3 = 0.5f / arrayList.size();
/* 154 */           int i3 = 0;
/* 155 */           boolean z = false;
/* 156 */           int i4 = 0;
/* 161 */           while (i3 < arrayList.size()) {
/* 167 */               PointF pointF = (PointF) arrayList.get(i3);
/* 173 */               PointF pointF2 = (PointF) arrayList2.get(i3);
/* 175 */               if (z) {
/* 179 */                   fArr[i4] = pointF.x;
/* 181 */                   int i5 = i4 + 1;
/* 185 */                   fArr[i5] = pointF.y;
/* 189 */                   fArr2[i4] = i3 * size3;
/* 191 */                   fArr2[i5] = 1.0f;
/* 193 */                   i4 += 2;
/* 195 */                   i3++;
                        } else {
/* 200 */                   fArr[i4] = pointF2.x;
/* 202 */                   int i6 = i4 + 1;
/* 206 */                   fArr[i6] = pointF2.y;
/* 210 */                   fArr2[i4] = i3 * size3;
/* 212 */                   fArr2[i6] = 0.0f;
/* 214 */                   i4 += 2;
                        }
/* 216 */               z = !z;
                    }
/* 234 */           FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(size * 8).order(ByteOrder.nativeOrder()).asFloatBuffer();
/* 238 */           floatBufferAsFloatBuffer.put(fArr);
/* 241 */           floatBufferAsFloatBuffer.position(0);
/* 257 */           FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(size2 * 8).order(ByteOrder.nativeOrder()).asFloatBuffer();
/* 261 */           floatBufferAsFloatBuffer2.put(fArr2);
/* 264 */           floatBufferAsFloatBuffer2.position(0);
/* 269 */           C0741j1 c0741j1 = new C0741j1();
/* 272 */           c0741j1.f5499a = floatBufferAsFloatBuffer;
/* 274 */           c0741j1.f5500b = floatBufferAsFloatBuffer2;
/* 277 */           c0741j1.f5503e = 2;
/* 279 */           c0741j1.f5502d = 8;
/* 282 */           c0741j1.f5501c = i2 / 2;
/* 284 */           c0741j1.f5504f = 8;
/* 286 */           return c0741j1;
                }

                /* JADX INFO: renamed from: a */
/* 286 */       public static C0741j1 m2617a() {
/* 287 */           C0741j1 c0741j1 = new C0741j1();
/* 288 */           c0741j1.f5499a = f5497h;
/* 289 */           c0741j1.f5500b = f5498i;
/* 290 */           c0741j1.f5503e = 2;
/* 291 */           c0741j1.f5502d = 8;
/* 292 */           c0741j1.f5501c = f5496g.length / 2;
/* 293 */           c0741j1.f5504f = 8;
                    return c0741j1;
                }
            }
