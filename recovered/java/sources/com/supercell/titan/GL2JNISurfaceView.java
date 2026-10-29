            package com.supercell.titan;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.util.DisplayMetrics;
            import android.view.Display;
            import android.view.MotionEvent;
            import android.view.SurfaceHolder;
            import android.view.SurfaceView;
            import java.util.HashSet;
            import p000.mp0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GL2JNISurfaceView extends SurfaceView implements SurfaceHolder.Callback {

                /* JADX INFO: renamed from: a */
                public SurfaceHolder f5732a;

                /* JADX INFO: renamed from: b */
                public float f5733b;

                /* JADX INFO: renamed from: c */
                public float f5734c;

                /* JADX INFO: renamed from: d */
                public boolean f5735d;

                /* JADX INFO: renamed from: e */
                public boolean f5736e;

                /* JADX INFO: renamed from: f */
                public boolean f5737f;

                /* JADX INFO: renamed from: i */
                public boolean f5738i;

                /* JADX INFO: renamed from: v */
                public final HashSet f5739v;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TouchEvent {
                    public static final int TYPE_CANCEL = 3;
                    public static final int TYPE_DOWN = 0;
                    public static final int TYPE_MOVE = 2;
                    public static final int TYPE_UP = 1;

                    /* JADX INFO: renamed from: id */
                    public int f5740id;
                    public int type;

                    /* JADX INFO: renamed from: x */
                    public int f5741x;

                    /* JADX INFO: renamed from: y */
                    public int f5742y;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class TouchInfo {
                    public int idx;
                    public int uniqueId;

                    public TouchInfo(int i, int i2) {
/* 4 */                 this.idx = i;
/* 6 */                 this.uniqueId = i2;
                    }
                }

                public GL2JNISurfaceView(Context context) {
/* 1 */             super(context);
/* 6 */             this.f5733b = 1.0f;
/* 8 */             this.f5734c = 1.0f;
/* 10 */            int i = 0;
/* 11 */            this.f5735d = false;
/* 13 */            this.f5736e = false;
/* 15 */            this.f5737f = false;
/* 17 */            this.f5738i = false;
/* 26 */            this.f5739v = new HashSet(10);
/* 30 */            setId(R.id.stage);
/* 37 */            getHolder().addCallback(this);
/* 41 */            for (int i2 = 0; i2 < 10; i2++) {
/* 49 */                this.f5739v.add(Integer.valueOf(i2));
                    }
/* 60 */            addOnLayoutChangeListener(new mp0(this, i));
                }

                @Override // android.view.View
                public float getScaleX() {
/* 1 */             return this.f5733b;
                }

                @Override // android.view.View
                public float getScaleY() {
/* 1 */             return this.f5734c;
                }

                @Override // android.view.View
                public boolean onGenericMotionEvent(MotionEvent motionEvent) {
/* 11 */            if (motionEvent.isFromSource(16777232)) {
/* 17 */                if (motionEvent.getAction() != 2) {
/* 9 */                     return false;
                        }
/* 23 */                for (int i = 0; i < motionEvent.getHistorySize(); i++) {
                        }
/* 10 */                return true;
                    }
/* 34 */            if (!motionEvent.isFromSource(2)) {
/* 83 */                return super.onGenericMotionEvent(motionEvent);
                    }
                    switch (motionEvent.getAction()) {
                        case 7:
                        case 9:
                        case 10:
/* 79 */                    GameApp.nOnMouseHoverEvent(motionEvent.getX(), motionEvent.getY());
/* 10 */                    return true;
                        case 8:
/* 52 */                    GameApp.nOnMouseHoverEvent(motionEvent.getX(), motionEvent.getY());
/* 67 */                    GameApp.nOnMouseEvent(motionEvent.getAxisValue(10), motionEvent.getAxisValue(9));
/* 10 */                    return true;
                        default:
/* 9 */                     return false;
                    }
                }

                public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
/* 1 */             this.f5735d = z;
/* 3 */             if (z) {
/* 8 */                 return;
                    }
/* 6 */             this.f5736e = true;
                }

                public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
/* 1 */             this.f5737f = z;
/* 3 */             if (z) {
/* 8 */                 return;
                    }
/* 6 */             this.f5738i = true;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0062  */
                /* JADX WARN: Code duplicated, block: B:22:0x007b  */
                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 5 */             int i = 0;
/* 6 */             if (!GameApp.isNativeLibraryLoaded()) {
/* 5 */                 return false;
                    }
/* 11 */            TouchEvent touchEvent = new TouchEvent();
/* 14 */            int actionIndex = motionEvent.getActionIndex();
/* 18 */            int actionMasked = motionEvent.getActionMasked();
/* 22 */            int pointerId = motionEvent.getPointerId(actionIndex);
/* 27 */            if (actionMasked == 0) {
/* 124 */               touchEvent.type = 0;
/* 134 */               touchEvent.f5741x = (int) (motionEvent.getX(actionIndex) * this.f5733b);
/* 144 */               touchEvent.f5742y = (int) (motionEvent.getY(actionIndex) * this.f5734c);
/* 146 */               touchEvent.f5740id = pointerId;
                    } else if (actionMasked == 1) {
/* 99 */                touchEvent.type = 1;
/* 109 */               touchEvent.f5741x = (int) (motionEvent.getX(actionIndex) * this.f5733b);
/* 119 */               touchEvent.f5742y = (int) (motionEvent.getY(actionIndex) * this.f5734c);
/* 121 */               touchEvent.f5740id = pointerId;
                    } else if (actionMasked == 2) {
/* 51 */                while (i < motionEvent.getPointerCount()) {
/* 55 */                    TouchEvent touchEvent2 = new TouchEvent();
/* 58 */                    touchEvent2.type = 2;
/* 64 */                    touchEvent2.f5740id = motionEvent.getPointerId(i);
/* 74 */                    touchEvent2.f5741x = (int) (motionEvent.getX(i) * this.f5733b);
/* 83 */                    int y = (int) (motionEvent.getY(i) * this.f5734c);
/* 84 */                    touchEvent2.f5742y = y;
/* 92 */                    GameApp.nOnTouchEvent(touchEvent2.type, touchEvent2.f5741x, y, touchEvent2.f5740id);
/* 95 */                    i++;
/* 97 */                    touchEvent = null;
                        }
                    } else if (actionMasked == 3) {
/* 44 */                touchEvent.type = 3;
                    } else if (actionMasked == 5) {
/* 124 */               touchEvent.type = 0;
/* 134 */               touchEvent.f5741x = (int) (motionEvent.getX(actionIndex) * this.f5733b);
/* 144 */               touchEvent.f5742y = (int) (motionEvent.getY(actionIndex) * this.f5734c);
/* 146 */               touchEvent.f5740id = pointerId;
                    } else if (actionMasked == 6) {
/* 99 */                touchEvent.type = 1;
/* 109 */               touchEvent.f5741x = (int) (motionEvent.getX(actionIndex) * this.f5733b);
/* 119 */               touchEvent.f5742y = (int) (motionEvent.getY(actionIndex) * this.f5734c);
/* 121 */               touchEvent.f5740id = pointerId;
                    }
/* 148 */           if (touchEvent != null) {
/* 158 */               GameApp.nOnTouchEvent(touchEvent.type, touchEvent.f5741x, touchEvent.f5742y, touchEvent.f5740id);
                    }
/* 26 */            return true;
                }

                public void setFixedSize(int i, int i2) {
/* 1 */             if (i <= 0 || i2 <= 0) {
/* 46 */                return;
                    }
/* 13 */            Display defaultDisplay = GameApp.getInstance().getWindowManager().getDefaultDisplay();
/* 19 */            DisplayMetrics displayMetrics = new DisplayMetrics();
/* 22 */            defaultDisplay.getRealMetrics(displayMetrics);
/* 29 */            getHolder().setFixedSize(i, i2);
/* 37 */            this.f5733b = i / displayMetrics.widthPixels;
/* 44 */            this.f5734c = i2 / displayMetrics.heightPixels;
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
/* 1 */             this.f5732a = surfaceHolder;
/* 11 */            int width = (int) (getWidth() * this.f5733b);
/* 20 */            int height = (int) (getHeight() * this.f5734c);
/* 25 */            if (GameApp.isNativeLibraryLoaded()) {
/* 31 */                GameApp.nOnSurfaceChanged(surfaceHolder.getSurface(), width, height);
                    }
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
/* 1 */             this.f5732a = surfaceHolder;
/* 7 */             if (GameApp.isNativeLibraryLoaded()) {
/* 13 */                GameApp.nOnSurfaceCreated(surfaceHolder.getSurface());
                    }
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
/* 2 */             this.f5732a = null;
/* 8 */             if (GameApp.isNativeLibraryLoaded()) {
/* 14 */                GameApp.nOnSurfaceDestroyed(surfaceHolder.getSurface());
                    }
                }
            }
