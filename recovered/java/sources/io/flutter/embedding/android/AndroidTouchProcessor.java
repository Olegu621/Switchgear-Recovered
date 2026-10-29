            package io.flutter.embedding.android;

            import android.R;
            import android.content.Context;
            import android.graphics.Matrix;
            import android.os.Build;
            import android.util.TypedValue;
            import android.view.InputDevice;
            import android.view.MotionEvent;
            import android.view.ViewConfiguration;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.HashMap;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 176 */   public class AndroidTouchProcessor {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                static final int BYTES_PER_FIELD = 8;
                static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;
                static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
                private static final Matrix IDENTITY_TRANSFORM = new Matrix();
                private static final int IMPLICIT_VIEW_ID = 0;
                static final int POINTER_DATA_FIELD_COUNT = 36;
                private static final int POINTER_DATA_FLAG_BATCHED = 1;
                private static final String TAG = "AndroidTouchProcessor";
                private static final int TOOL_TYPE_BITS = 3;
                private static final int TOOL_TYPE_MASK = 7;
                private int cachedVerticalScrollFactor;
                private final FlutterRenderer renderer;
                private final boolean trackMotionEvents;
                private final Map<Integer, float[]> ongoingPans = new HashMap();
                private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public @interface PointerChange {
                    public static final int ADD = 1;
                    public static final int CANCEL = 0;
                    public static final int DOWN = 4;
                    public static final int HOVER = 3;
                    public static final int MOVE = 5;
                    public static final int PAN_ZOOM_END = 9;
                    public static final int PAN_ZOOM_START = 7;
                    public static final int PAN_ZOOM_UPDATE = 8;
                    public static final int REMOVE = 2;

                    /* JADX INFO: renamed from: UP */
                    public static final int f9735UP = 6;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public @interface PointerDeviceKind {
                    public static final int INVERTED_STYLUS = 3;
                    public static final int MOUSE = 1;
                    public static final int STYLUS = 2;
                    public static final int TOUCH = 0;
                    public static final int TRACKPAD = 4;
                    public static final int UNKNOWN = 5;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public @interface PointerSignalKind {
                    public static final int NONE = 0;
                    public static final int SCALE = 3;
                    public static final int SCROLL = 1;
                    public static final int SCROLL_INERTIA_CANCEL = 2;
                    public static final int UNKNOWN = 4;
                }

                public AndroidTouchProcessor(FlutterRenderer flutterRenderer, boolean z) {
/* 11 */            this.renderer = flutterRenderer;
/* 19 */            this.trackMotionEvents = z;
                }

                private void addPointerForIndex(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer, Context context) {
                    int i4;
                    int i5;
                    long j;
                    long buttonState;
                    double min;
                    double max;
                    double horizontalScrollFactor;
                    double verticalScrollFactor;
                    InputDevice.MotionRange motionRange;
/* 13 */            int i6 = -1;
/* 14 */            if (i2 == -1) {
/* 531 */               return;
                    }
/* 18 */            int iUniquePointerIdByType = uniquePointerIdByType(motionEvent, i);
/* 26 */            int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i));
/* 39 */            float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
/* 49 */            matrix.mapPoints(fArr);
/* 53 */            if (pointerDeviceTypeForToolType == 1) {
/* 59 */                i5 = 0;
/* 63 */                j = 0;
/* 61 */                long buttonState2 = motionEvent.getButtonState() & 31;
/* 68 */                if (buttonState2 == 0) {
/* 74 */                    i4 = 1;
/* 78 */                    if (motionEvent.getSource() == 8194 && i2 == 4) {
/* 88 */                        this.ongoingPans.put(Integer.valueOf(iUniquePointerIdByType), fArr);
                            }
                        } else {
/* 92 */                    i4 = 1;
                        }
/* 94 */                buttonState = buttonState2;
                    } else {
/* 96 */                i4 = 1;
/* 98 */                i5 = 0;
/* 100 */               j = 0;
/* 113 */               buttonState = pointerDeviceTypeForToolType == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
                    }
/* 121 */           boolean zContainsKey = this.ongoingPans.containsKey(Integer.valueOf(iUniquePointerIdByType));
/* 125 */           if (zContainsKey) {
/* 127 */               int pointerChangeForPanZoom = getPointerChangeForPanZoom(i2);
/* 131 */               if (pointerChangeForPanZoom == -1) {
/* 531 */                   return;
                        } else {
/* 135 */                   i6 = pointerChangeForPanZoom;
                        }
                    }
/* 151 */           long id = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent).getId() : j;
/* 166 */           int i7 = motionEvent.getActionMasked() == 8 ? i4 : i5;
/* 176 */           long eventTime = motionEvent.getEventTime() * 1000;
/* 178 */           byteBuffer.putLong(id);
/* 181 */           byteBuffer.putLong(eventTime);
/* 184 */           if (zContainsKey) {
/* 187 */               byteBuffer.putLong(i6);
/* 192 */               byteBuffer.putLong(4L);
                    } else {
/* 197 */               byteBuffer.putLong(i2);
/* 201 */               byteBuffer.putLong(pointerDeviceTypeForToolType);
                    }
/* 205 */           byteBuffer.putLong(i7);
/* 209 */           byteBuffer.putLong(iUniquePointerIdByType);
/* 214 */           byteBuffer.putLong(j);
/* 217 */           if (zContainsKey) {
/* 225 */               float[] fArr2 = this.ongoingPans.get(Integer.valueOf(iUniquePointerIdByType));
/* 234 */               byteBuffer.putDouble(fArr2[i5]);
/* 240 */               byteBuffer.putDouble(fArr2[i4]);
                    } else {
/* 247 */               byteBuffer.putDouble(fArr[i5]);
/* 253 */               byteBuffer.putDouble(fArr[i4]);
                    }
/* 258 */           byteBuffer.putDouble(0.0d);
/* 261 */           byteBuffer.putDouble(0.0d);
/* 264 */           byteBuffer.putLong(buttonState);
/* 269 */           byteBuffer.putLong(0L);
/* 272 */           byteBuffer.putLong(0L);
/* 280 */           byteBuffer.putDouble(motionEvent.getPressure(i));
/* 287 */           if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
/* 311 */               min = 0.0d;
/* 312 */               max = 1.0d;
                    } else {
/* 300 */               min = motionRange.getMin();
/* 305 */               max = motionRange.getMax();
                    }
/* 314 */           byteBuffer.putDouble(min);
/* 317 */           byteBuffer.putDouble(max);
/* 321 */           if (pointerDeviceTypeForToolType == 2) {
/* 330 */               byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
/* 333 */               byteBuffer.putDouble(0.0d);
                    } else {
/* 337 */               byteBuffer.putDouble(0.0d);
/* 340 */               byteBuffer.putDouble(0.0d);
                    }
/* 348 */           byteBuffer.putDouble(motionEvent.getSize(i));
/* 356 */           byteBuffer.putDouble(motionEvent.getToolMajor(i));
/* 364 */           byteBuffer.putDouble(motionEvent.getToolMinor(i));
/* 367 */           byteBuffer.putDouble(0.0d);
/* 370 */           byteBuffer.putDouble(0.0d);
/* 380 */           byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
/* 384 */           if (pointerDeviceTypeForToolType == 2) {
/* 393 */               byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
                    } else {
/* 399 */               byteBuffer.putDouble(0.0d);
                    }
/* 404 */           byteBuffer.putLong(i3);
/* 411 */           if (i7 == i4) {
/* 413 */               if (context != null) {
/* 415 */                   horizontalScrollFactor = getHorizontalScrollFactor(context);
/* 420 */                   verticalScrollFactor = getVerticalScrollFactor(context);
                        } else {
/* 426 */                   horizontalScrollFactor = 48.0d;
/* 428 */                   verticalScrollFactor = 48.0d;
                        }
/* 437 */               double d = horizontalScrollFactor * ((double) (-motionEvent.getAxisValue(10, i)));
/* 444 */               double d2 = verticalScrollFactor * ((double) (-motionEvent.getAxisValue(9, i)));
/* 445 */               byteBuffer.putDouble(d);
/* 448 */               byteBuffer.putDouble(d2);
                    } else {
/* 452 */               byteBuffer.putDouble(0.0d);
/* 455 */               byteBuffer.putDouble(0.0d);
                    }
/* 458 */           if (zContainsKey) {
/* 466 */               float[] fArr3 = this.ongoingPans.get(Integer.valueOf(iUniquePointerIdByType));
/* 478 */               byteBuffer.putDouble(fArr[i5] - fArr3[i5]);
/* 489 */               byteBuffer.putDouble(fArr[1] - fArr3[1]);
                    } else {
/* 493 */               byteBuffer.putDouble(0.0d);
/* 496 */               byteBuffer.putDouble(0.0d);
                    }
/* 499 */           byteBuffer.putDouble(0.0d);
/* 502 */           byteBuffer.putDouble(0.0d);
/* 507 */           byteBuffer.putDouble(1.0d);
/* 510 */           byteBuffer.putDouble(0.0d);
/* 515 */           byteBuffer.putLong(0L);
/* 518 */           if (zContainsKey && i6 == 9) {
/* 528 */               this.ongoingPans.remove(Integer.valueOf(iUniquePointerIdByType));
                    }
                }

                private float getHorizontalScrollFactor(Context context) {
                    return Build.VERSION.SDK_INT >= 26 ? ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : getVerticalScrollFactorPre26(context);
                }

                private int getPointerChangeForAction(int i) {
/* 2 */             if (i == 0) {
/* 1 */                 return 4;
                    }
/* 7 */             if (i == 1) {
/* 6 */                 return 6;
                    }
/* 11 */            if (i == 5) {
/* 1 */                 return 4;
                    }
/* 14 */            if (i == 6) {
/* 6 */                 return 6;
                    }
/* 18 */            if (i == 2) {
/* 10 */                return 5;
                    }
/* 23 */            if (i == 7) {
/* 22 */                return 3;
                    }
/* 26 */            if (i == 3) {
/* 28 */                return 0;
                    }
                    return i == 8 ? 3 : -1;
                }

                private int getPointerChangeForPanZoom(int i) {
/* 2 */             if (i == 4) {
/* 4 */                 return 7;
                    }
/* 7 */             if (i == 5) {
/* 9 */                 return 8;
                    }
                    return (i == 6 || i == 0) ? 9 : -1;
                }

                private int getPointerDeviceTypeForToolType(int i) {
/* 2 */             if (i == 1) {
/* 18 */                return 0;
                    }
/* 5 */             if (i == 2) {
/* 4 */                 return 2;
                    }
/* 8 */             if (i != 3) {
                        return i != 4 ? 5 : 3;
                    }
/* 1 */             return 1;
                }

                private float getVerticalScrollFactor(Context context) {
                    return Build.VERSION.SDK_INT >= 26 ? getVerticalScrollFactorAbove26(context) : getVerticalScrollFactorPre26(context);
                }

                private float getVerticalScrollFactorAbove26(Context context) {
/* 1 */             return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
                }

                private int getVerticalScrollFactorPre26(Context context) {
/* 3 */             if (this.cachedVerticalScrollFactor == 0) {
/* 7 */                 TypedValue typedValue = new TypedValue();
/* 22 */                if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
/* 24 */                    return 48;
                        }
/* 40 */                this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
                    }
/* 42 */            return this.cachedVerticalScrollFactor;
                }

                private int uniquePointerIdByType(MotionEvent motionEvent, int i) {
/* 13 */            return (motionEvent.getPointerId(i) << 3) | (motionEvent.getToolType(i) & 7);
                }

                public boolean onGenericMotionEvent(MotionEvent motionEvent, Context context) {
/* 2 */             boolean zIsFromSource = motionEvent.isFromSource(2);
/* 26 */            boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
/* 27 */            if (zIsFromSource && z) {
/* 35 */                int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
/* 45 */                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
/* 51 */                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
/* 64 */                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, byteBufferAllocateDirect, context);
/* 73 */                if (byteBufferAllocateDirect.position() % 288 == 0) {
/* 81 */                    this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
/* 11 */                    return true;
                        }
/* 87 */                C1951n4.m6856g("Packet position is not on field boundary.");
                    }
/* 12 */            return false;
                }

                public boolean onTouchEvent(MotionEvent motionEvent, Matrix matrix) {
/* 1 */             int actionMasked = motionEvent.getActionMasked();
/* 9 */             int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
/* 23 */            boolean z = actionMasked == 0 || actionMasked == 5;
/* 33 */            boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
/* 52 */            int i = (z2 && getPointerDeviceTypeForToolType(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
/* 53 */            int pointerCount = motionEvent.getPointerCount();
/* 61 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i) * 288);
/* 67 */            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
/* 70 */            if (z) {
/* 80 */                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
                    } else if (z2) {
/* 88 */                for (int i2 = 0; i2 < pointerCount; i2++) {
/* 94 */                    if (i2 != motionEvent.getActionIndex() && motionEvent.getToolType(i2) == 1) {
/* 107 */                       addPointerForIndex(motionEvent, i2, 5, 1, matrix, byteBufferAllocateDirect);
                            }
                        }
/* 122 */               addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
/* 125 */               if (i != 0) {
/* 136 */                   addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect);
                        }
                    } else {
/* 142 */               for (int i3 = 0; i3 < pointerCount; i3++) {
/* 148 */                   addPointerForIndex(motionEvent, i3, pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
                        }
                    }
/* 160 */           if (byteBufferAllocateDirect.position() % 288 == 0) {
/* 168 */               this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
/* 14 */                return true;
                    }
/* 174 */           C1951n4.m6856g("Packet position is not on field boundary");
/* 13 */            return false;
                }

/* 177 */       public boolean onTouchEvent(MotionEvent motionEvent) {
/* 178 */           return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
                }

/* 531 */       private void addPointerForIndex(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
/* 532 */           addPointerForIndex(motionEvent, i, i2, i3, matrix, byteBuffer, null);
                }
            }
