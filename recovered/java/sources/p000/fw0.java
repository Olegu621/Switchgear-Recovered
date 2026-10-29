            package p000;

            import android.graphics.ColorMatrix;
            import android.graphics.ColorMatrixColorFilter;
            import android.widget.ImageView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fw0 {

                /* JADX INFO: renamed from: a */
                public final float[] f8374a = new float[20];

                /* JADX INFO: renamed from: b */
                public final ColorMatrix f8375b = new ColorMatrix();

                /* JADX INFO: renamed from: c */
                public final ColorMatrix f8376c = new ColorMatrix();

                /* JADX INFO: renamed from: d */
                public float f8377d = 1.0f;

                /* JADX INFO: renamed from: e */
                public float f8378e = 1.0f;

                /* JADX INFO: renamed from: f */
                public float f8379f = 1.0f;

                /* JADX INFO: renamed from: g */
                public float f8380g = 1.0f;

                /* JADX INFO: renamed from: a */
                public final void m3849a(ImageView imageView) {
                    boolean z;
                    float f;
                    float fLog;
                    float fPow;
                    float f2;
                    float fLog2;
/* 3 */             ColorMatrix colorMatrix = this.f8375b;
/* 5 */             colorMatrix.reset();
/* 8 */             float f3 = this.f8378e;
/* 16 */            char c = 16;
/* 18 */            char c2 = 15;
/* 20 */            char c3 = 14;
/* 22 */            char c4 = '\r';
/* 24 */            char c5 = '\f';
/* 26 */            char c6 = 11;
/* 51 */            float[] fArr = this.f8374a;
/* 53 */            boolean z2 = true;
/* 57 */            if (f3 != 1.0f) {
/* 59 */                float f4 = 1.0f - f3;
/* 64 */                float f5 = 0.2999f * f4;
/* 69 */                float f6 = 0.587f * f4;
/* 74 */                float f7 = f4 * 0.114f;
/* 78 */                fArr[0] = f5 + f3;
/* 80 */                fArr[1] = f6;
/* 82 */                fArr[2] = f7;
/* 84 */                fArr[3] = 0.0f;
/* 86 */                fArr[4] = 0.0f;
/* 88 */                fArr[5] = f5;
/* 92 */                fArr[6] = f6 + f3;
/* 94 */                fArr[7] = f7;
/* 96 */                fArr[8] = 0.0f;
/* 98 */                fArr[9] = 0.0f;
/* 100 */               fArr[10] = f5;
/* 102 */               fArr[11] = f6;
/* 105 */               fArr[12] = f7 + f3;
/* 107 */               fArr[13] = 0.0f;
/* 109 */               fArr[14] = 0.0f;
/* 111 */               fArr[15] = 0.0f;
/* 113 */               fArr[16] = 0.0f;
/* 115 */               fArr[17] = 0.0f;
/* 117 */               fArr[18] = 1.0f;
/* 119 */               fArr[19] = 0.0f;
/* 121 */               colorMatrix.set(fArr);
/* 124 */               z = true;
                    } else {
/* 127 */               z = false;
                    }
/* 129 */           float f8 = this.f8379f;
/* 135 */           ColorMatrix colorMatrix2 = this.f8376c;
/* 137 */           if (f8 != 1.0f) {
/* 139 */               colorMatrix2.setScale(f8, f8, f8, 1.0f);
/* 142 */               colorMatrix.postConcat(colorMatrix2);
/* 145 */               z = true;
                    }
/* 147 */           float f9 = this.f8380g;
/* 151 */           if (f9 != 1.0f) {
/* 155 */               if (f9 <= 0.0f) {
/* 157 */                   f9 = 0.01f;
                        }
/* 166 */               float f10 = (5000.0f / f9) / 100.0f;
/* 177 */               f = 1.0f;
/* 181 */               if (f10 > 66.0f) {
/* 187 */                   double d = f10 - 60.0f;
/* 210 */                   fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
/* 227 */                   fLog = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                        } else {
/* 249 */                   fLog = (((float) Math.log(f10)) * 99.4708f) - 161.11957f;
/* 251 */                   fPow = 255.0f;
                        }
/* 257 */               if (f10 >= 1115947008) {
/* 289 */                   f2 = 305.0448f;
/* 292 */                   fLog2 = 255.0f;
                        } else if (f10 > 19.0f) {
/* 269 */                   f2 = 305.0448f;
/* 279 */                   fLog2 = (((float) Math.log(f10 - 10.0f)) * 138.51773f) - 305.0448f;
                        } else {
/* 283 */                   f2 = 305.0448f;
/* 286 */                   fLog2 = 0.0f;
                        }
/* 297 */               float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
/* 305 */               float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
/* 313 */               float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
/* 326 */               float fLog3 = (((float) Math.log(50.0d)) * 99.4708f) - 161.11957f;
/* 330 */               c5 = '\f';
/* 339 */               float fLog4 = (((float) Math.log(40.0d)) * 138.51773f) - f2;
/* 345 */               float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
/* 353 */               float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
/* 368 */               float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
/* 369 */               fArr[0] = fMin / fMin4;
/* 371 */               fArr[1] = 0.0f;
/* 373 */               fArr[2] = 0.0f;
/* 375 */               fArr[3] = 0.0f;
/* 377 */               fArr[4] = 0.0f;
/* 379 */               fArr[5] = 0.0f;
/* 381 */               fArr[6] = fMin2 / fMin5;
/* 383 */               fArr[7] = 0.0f;
/* 385 */               fArr[8] = 0.0f;
/* 387 */               fArr[9] = 0.0f;
/* 389 */               fArr[10] = 0.0f;
/* 391 */               fArr[c6] = 0.0f;
/* 393 */               fArr[12] = fMin6;
/* 395 */               fArr[c4] = 0.0f;
/* 397 */               fArr[c3] = 0.0f;
/* 399 */               fArr[c2] = 0.0f;
/* 401 */               fArr[c] = 0.0f;
/* 403 */               fArr[17] = 0.0f;
/* 405 */               fArr[18] = 1.0f;
/* 407 */               fArr[19] = 0.0f;
/* 409 */               colorMatrix2.set(fArr);
/* 412 */               colorMatrix.postConcat(colorMatrix2);
/* 415 */               z = true;
                    } else {
/* 418 */               f = 1.0f;
/* 420 */               c = 16;
/* 422 */               c2 = 15;
/* 424 */               c3 = 14;
/* 425 */               c4 = '\r';
/* 427 */               c6 = 11;
                    }
/* 429 */           float f11 = this.f8377d;
/* 433 */           if (f11 != f) {
/* 435 */               fArr[0] = f11;
/* 437 */               fArr[1] = 0.0f;
/* 439 */               fArr[2] = 0.0f;
/* 441 */               fArr[3] = 0.0f;
/* 443 */               fArr[4] = 0.0f;
/* 445 */               fArr[5] = 0.0f;
/* 447 */               fArr[6] = f11;
/* 449 */               fArr[7] = 0.0f;
/* 451 */               fArr[8] = 0.0f;
/* 453 */               fArr[9] = 0.0f;
/* 455 */               fArr[10] = 0.0f;
/* 457 */               fArr[c6] = 0.0f;
/* 459 */               fArr[c5] = f11;
/* 461 */               fArr[c4] = 0.0f;
/* 463 */               fArr[c3] = 0.0f;
/* 465 */               fArr[c2] = 0.0f;
/* 467 */               fArr[c] = 0.0f;
/* 469 */               fArr[17] = 0.0f;
/* 471 */               fArr[18] = f;
/* 473 */               fArr[19] = 0.0f;
/* 475 */               colorMatrix2.set(fArr);
/* 478 */               colorMatrix.postConcat(colorMatrix2);
                    } else {
/* 482 */               z2 = z;
                    }
/* 484 */           if (z2) {
/* 493 */               imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    } else {
/* 499 */               imageView.clearColorFilter();
                    }
                }
            }
