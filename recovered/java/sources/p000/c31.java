            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseIntArray;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import androidx.core.app.NotificationCompat;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c31 extends a31 {

                /* JADX INFO: renamed from: e */
                public int f2680e = -1;

                /* JADX INFO: renamed from: f */
                public float f2681f = Float.NaN;

                /* JADX INFO: renamed from: g */
                public float f2682g = Float.NaN;

                /* JADX INFO: renamed from: h */
                public float f2683h = Float.NaN;

                /* JADX INFO: renamed from: i */
                public float f2684i = Float.NaN;

                /* JADX INFO: renamed from: j */
                public float f2685j = Float.NaN;

                /* JADX INFO: renamed from: k */
                public float f2686k = Float.NaN;

                /* JADX INFO: renamed from: l */
                public float f2687l = Float.NaN;

                /* JADX INFO: renamed from: m */
                public float f2688m = Float.NaN;

                /* JADX INFO: renamed from: n */
                public float f2689n = Float.NaN;

                /* JADX INFO: renamed from: o */
                public float f2690o = Float.NaN;

                /* JADX INFO: renamed from: p */
                public float f2691p = Float.NaN;

                /* JADX INFO: renamed from: q */
                public float f2692q = Float.NaN;

                /* JADX INFO: renamed from: r */
                public float f2693r = Float.NaN;

                /* JADX INFO: renamed from: s */
                public float f2694s = Float.NaN;

                public c31() {
/* 42 */            this.f75d = new HashMap();
                }

                @Override // p000.a31
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a31 clone() {
/* 3 */             c31 c31Var = new c31();
/* 8 */             c31Var.f72a = this.f72a;
/* 12 */            c31Var.f73b = this.f73b;
/* 16 */            c31Var.f74c = this.f74c;
/* 20 */            c31Var.f75d = this.f75d;
/* 24 */            c31Var.f2680e = this.f2680e;
/* 28 */            c31Var.f2681f = this.f2681f;
/* 32 */            c31Var.f2682g = this.f2682g;
/* 36 */            c31Var.f2683h = this.f2683h;
/* 40 */            c31Var.f2684i = this.f2684i;
/* 44 */            c31Var.f2685j = this.f2685j;
/* 48 */            c31Var.f2686k = this.f2686k;
/* 52 */            c31Var.f2687l = this.f2687l;
/* 56 */            c31Var.f2688m = this.f2688m;
/* 60 */            c31Var.f2689n = this.f2689n;
/* 64 */            c31Var.f2690o = this.f2690o;
/* 68 */            c31Var.f2691p = this.f2691p;
/* 72 */            c31Var.f2692q = this.f2692q;
/* 76 */            c31Var.f2693r = this.f2693r;
/* 80 */            c31Var.f2694s = this.f2694s;
/* 82 */            return c31Var;
                }

                @Override // p000.a31
                /* JADX INFO: renamed from: b */
                public final void mo44b(HashSet hashSet) {
/* 7 */             if (!Float.isNaN(this.f2681f)) {
/* 11 */                hashSet.add("alpha");
                    }
/* 20 */            if (!Float.isNaN(this.f2682g)) {
/* 24 */                hashSet.add("elevation");
                    }
/* 33 */            if (!Float.isNaN(this.f2683h)) {
/* 37 */                hashSet.add("rotation");
                    }
/* 46 */            if (!Float.isNaN(this.f2684i)) {
/* 50 */                hashSet.add("rotationX");
                    }
/* 59 */            if (!Float.isNaN(this.f2685j)) {
/* 63 */                hashSet.add("rotationY");
                    }
/* 72 */            if (!Float.isNaN(this.f2686k)) {
/* 76 */                hashSet.add("transformPivotX");
                    }
/* 85 */            if (!Float.isNaN(this.f2687l)) {
/* 89 */                hashSet.add("transformPivotY");
                    }
/* 98 */            if (!Float.isNaN(this.f2691p)) {
/* 102 */               hashSet.add("translationX");
                    }
/* 111 */           if (!Float.isNaN(this.f2692q)) {
/* 115 */               hashSet.add("translationY");
                    }
/* 124 */           if (!Float.isNaN(this.f2693r)) {
/* 128 */               hashSet.add("translationZ");
                    }
/* 137 */           if (!Float.isNaN(this.f2688m)) {
/* 141 */               hashSet.add("transitionPathRotate");
                    }
/* 150 */           if (!Float.isNaN(this.f2689n)) {
/* 154 */               hashSet.add("scaleX");
                    }
/* 163 */           if (!Float.isNaN(this.f2690o)) {
/* 167 */               hashSet.add("scaleY");
                    }
/* 176 */           if (!Float.isNaN(this.f2694s)) {
/* 180 */               hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
                    }
/* 189 */           if (this.f75d.size() > 0) {
/* 197 */               Iterator it = this.f75d.keySet().iterator();
/* 205 */               while (it.hasNext()) {
/* 227 */                   hashSet.add("CUSTOM," + ((String) it.next()));
                        }
                    }
                }

                @Override // p000.a31
                /* JADX INFO: renamed from: c */
                public final void mo45c(Context context, AttributeSet attributeSet) {
/* 3 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyAttribute);
/* 7 */             SparseIntArray sparseIntArray = b31.f2196a;
/* 9 */             int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 14 */            for (int i = 0; i < indexCount; i++) {
/* 16 */                int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 20 */                SparseIntArray sparseIntArray2 = b31.f2196a;
                        switch (sparseIntArray2.get(index)) {
                            case 1:
/* 267 */                       this.f2681f = typedArrayObtainStyledAttributes.getFloat(index, this.f2681f);
                                break;
                            case 2:
/* 258 */                       this.f2682g = typedArrayObtainStyledAttributes.getDimension(index, this.f2682g);
                                break;
                            case 3:
                            case 11:
                            default:
/* 61 */                        AbstractC1245n0.m4876d("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                                break;
                            case 4:
/* 249 */                       this.f2683h = typedArrayObtainStyledAttributes.getFloat(index, this.f2683h);
                                break;
                            case 5:
/* 240 */                       this.f2684i = typedArrayObtainStyledAttributes.getFloat(index, this.f2684i);
                                break;
                            case 6:
/* 231 */                       this.f2685j = typedArrayObtainStyledAttributes.getFloat(index, this.f2685j);
                                break;
                            case 7:
/* 222 */                       this.f2689n = typedArrayObtainStyledAttributes.getFloat(index, this.f2689n);
                                break;
                            case 8:
/* 213 */                       this.f2688m = typedArrayObtainStyledAttributes.getFloat(index, this.f2688m);
                                break;
                            case 9:
/* 203 */                       typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 10:
/* 158 */                       if (MotionLayout.f875s1) {
/* 162 */                           int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f73b);
/* 166 */                           this.f73b = resourceId;
/* 169 */                           if (resourceId == -1) {
/* 175 */                               this.f74c = typedArrayObtainStyledAttributes.getString(index);
                                    }
                                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
/* 191 */                           this.f74c = typedArrayObtainStyledAttributes.getString(index);
                                } else {
/* 200 */                           this.f73b = typedArrayObtainStyledAttributes.getResourceId(index, this.f73b);
                                }
                                break;
                            case 12:
/* 152 */                       this.f72a = typedArrayObtainStyledAttributes.getInt(index, this.f72a);
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 142 */                       this.f2680e = typedArrayObtainStyledAttributes.getInteger(index, this.f2680e);
                                break;
                            case 14:
/* 132 */                       this.f2690o = typedArrayObtainStyledAttributes.getFloat(index, this.f2690o);
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 122 */                       this.f2691p = typedArrayObtainStyledAttributes.getDimension(index, this.f2691p);
                                break;
                            case 16:
/* 112 */                       this.f2692q = typedArrayObtainStyledAttributes.getDimension(index, this.f2692q);
                                break;
                            case 17:
/* 102 */                       this.f2693r = typedArrayObtainStyledAttributes.getDimension(index, this.f2693r);
                                break;
                            case 18:
/* 92 */                        this.f2694s = typedArrayObtainStyledAttributes.getFloat(index, this.f2694s);
                                break;
                            case 19:
/* 82 */                        this.f2686k = typedArrayObtainStyledAttributes.getDimension(index, this.f2686k);
                                break;
                            case 20:
/* 72 */                        this.f2687l = typedArrayObtainStyledAttributes.getDimension(index, this.f2687l);
                                break;
                        }
                    }
                }

                @Override // p000.a31
                /* JADX INFO: renamed from: d */
                public final void mo46d(HashMap map) {
/* 4 */             if (this.f2680e == -1) {
/* 320 */               return;
                    }
/* 14 */            if (!Float.isNaN(this.f2681f)) {
/* 24 */                map.put("alpha", Integer.valueOf(this.f2680e));
                    }
/* 33 */            if (!Float.isNaN(this.f2682g)) {
/* 43 */                map.put("elevation", Integer.valueOf(this.f2680e));
                    }
/* 52 */            if (!Float.isNaN(this.f2683h)) {
/* 62 */                map.put("rotation", Integer.valueOf(this.f2680e));
                    }
/* 71 */            if (!Float.isNaN(this.f2684i)) {
/* 81 */                map.put("rotationX", Integer.valueOf(this.f2680e));
                    }
/* 90 */            if (!Float.isNaN(this.f2685j)) {
/* 100 */               map.put("rotationY", Integer.valueOf(this.f2680e));
                    }
/* 109 */           if (!Float.isNaN(this.f2686k)) {
/* 119 */               map.put("transformPivotX", Integer.valueOf(this.f2680e));
                    }
/* 128 */           if (!Float.isNaN(this.f2687l)) {
/* 138 */               map.put("transformPivotY", Integer.valueOf(this.f2680e));
                    }
/* 147 */           if (!Float.isNaN(this.f2691p)) {
/* 157 */               map.put("translationX", Integer.valueOf(this.f2680e));
                    }
/* 166 */           if (!Float.isNaN(this.f2692q)) {
/* 176 */               map.put("translationY", Integer.valueOf(this.f2680e));
                    }
/* 185 */           if (!Float.isNaN(this.f2693r)) {
/* 195 */               map.put("translationZ", Integer.valueOf(this.f2680e));
                    }
/* 204 */           if (!Float.isNaN(this.f2688m)) {
/* 214 */               map.put("transitionPathRotate", Integer.valueOf(this.f2680e));
                    }
/* 223 */           if (!Float.isNaN(this.f2689n)) {
/* 233 */               map.put("scaleX", Integer.valueOf(this.f2680e));
                    }
/* 242 */           if (!Float.isNaN(this.f2690o)) {
/* 252 */               map.put("scaleY", Integer.valueOf(this.f2680e));
                    }
/* 261 */           if (!Float.isNaN(this.f2694s)) {
/* 271 */               map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f2680e));
                    }
/* 280 */           if (this.f75d.size() > 0) {
/* 288 */               Iterator it = this.f75d.keySet().iterator();
/* 296 */               while (it.hasNext()) {
/* 316 */                   map.put(AbstractC0886en.m3507k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f2680e));
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m1523f(Object obj, String str) {
                    switch (str) {
                        case "motionProgress":
/* 392 */                   this.f2694s = a31.m42e((Number) obj);
                            break;
                        case "transitionEasing":
/* 382 */                   obj.toString();
                            break;
                        case "rotationX":
/* 379 */                   this.f2684i = a31.m42e((Number) obj);
                            break;
                        case "rotationY":
/* 370 */                   this.f2685j = a31.m42e((Number) obj);
                            break;
                        case "translationX":
/* 361 */                   this.f2691p = a31.m42e((Number) obj);
                            break;
                        case "translationY":
/* 352 */                   this.f2692q = a31.m42e((Number) obj);
                            break;
                        case "translationZ":
/* 343 */                   this.f2693r = a31.m42e((Number) obj);
                            break;
                        case "scaleX":
/* 334 */                   this.f2689n = a31.m42e((Number) obj);
                            break;
                        case "scaleY":
/* 325 */                   this.f2690o = a31.m42e((Number) obj);
                            break;
                        case "transformPivotX":
/* 316 */                   this.f2686k = a31.m42e((Number) obj);
                            break;
                        case "transformPivotY":
/* 307 */                   this.f2687l = a31.m42e((Number) obj);
                            break;
                        case "rotation":
/* 298 */                   this.f2683h = a31.m42e((Number) obj);
                            break;
                        case "elevation":
/* 289 */                   this.f2682g = a31.m42e((Number) obj);
                            break;
                        case "transitionPathRotate":
/* 280 */                   this.f2688m = a31.m42e((Number) obj);
                            break;
                        case "alpha":
/* 271 */                   this.f2681f = a31.m42e((Number) obj);
                            break;
                        case "curveFit":
/* 241 */                   Number number = (Number) obj;
/* 262 */                   this.f2680e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                            break;
                        case "visibility":
/* 230 */                   if (!(obj instanceof Boolean)) {
/* 237 */                       Boolean.parseBoolean(obj.toString());
                                break;
                            }
                            break;
                    }
                }
            }
