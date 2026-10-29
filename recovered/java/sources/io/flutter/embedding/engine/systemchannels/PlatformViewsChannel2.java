            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.nio.ByteBuffer;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PlatformViewsChannel2 {
                private static final String TAG = "PlatformViewsChannel2";
                private final MethodChannel channel;
                private PlatformViewsHandler handler;
                private final MethodChannel.MethodCallHandler parsingHandler;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PlatformViewCreationRequest {
                    public final int direction;
                    public final double logicalHeight;
                    public final double logicalWidth;
                    public final ByteBuffer params;
                    public final int viewId;
                    public final String viewType;

                    public PlatformViewCreationRequest(int i, String str, double d, double d2, int i2, ByteBuffer byteBuffer) {
/* 4 */                 this.viewId = i;
/* 6 */                 this.viewType = str;
/* 8 */                 this.logicalWidth = d;
/* 10 */                this.logicalHeight = d2;
/* 12 */                this.direction = i2;
/* 14 */                this.params = byteBuffer;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PlatformViewTouch {
                    public final int action;
                    public final int buttonState;
                    public final int deviceId;
                    public final Number downTime;
                    public final int edgeFlags;
                    public final Number eventTime;
                    public final int flags;
                    public final int metaState;
                    public final long motionEventId;
                    public final int pointerCount;
                    public final Object rawPointerCoords;
                    public final Object rawPointerPropertiesList;
                    public final int source;
                    public final int viewId;
                    public final float xPrecision;
                    public final float yPrecision;

                    public PlatformViewTouch(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
/* 4 */                 this.viewId = i;
/* 6 */                 this.downTime = number;
/* 8 */                 this.eventTime = number2;
/* 10 */                this.action = i2;
/* 12 */                this.pointerCount = i3;
/* 14 */                this.rawPointerPropertiesList = obj;
/* 16 */                this.rawPointerCoords = obj2;
/* 18 */                this.metaState = i4;
/* 20 */                this.buttonState = i5;
/* 22 */                this.xPrecision = f;
/* 24 */                this.yPrecision = f2;
/* 26 */                this.deviceId = i6;
/* 28 */                this.edgeFlags = i7;
/* 30 */                this.source = i8;
/* 32 */                this.flags = i9;
/* 36 */                this.motionEventId = j;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface PlatformViewsHandler {
                    void clearFocus(int i);

                    void createPlatformView(PlatformViewCreationRequest platformViewCreationRequest);

                    void dispose(int i);

                    boolean isSurfaceControlEnabled();

                    void onTouch(PlatformViewTouch platformViewTouch);

                    void setDirection(int i, int i2);
                }

                public PlatformViewsChannel2(DartExecutor dartExecutor) {
/* 6 */             MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.1
                        private void clearFocus(MethodCall methodCall, MethodChannel.Result result) {
                            try {
/* 18 */                        PlatformViewsChannel2.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
/* 21 */                        result.success(null);
                            } catch (IllegalStateException e) {
/* 32 */                        result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                            }
                        }

                        private void create(MethodCall methodCall, MethodChannel.Result result) {
/* 5 */                     Map map = (Map) methodCall.arguments();
                            try {
/* 77 */                        PlatformViewsChannel2.this.handler.createPlatformView(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
/* 80 */                        result.success(null);
                            } catch (IllegalStateException e) {
/* 92 */                        result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                            }
                        }

                        private void dispose(MethodCall methodCall, MethodChannel.Result result) {
                            try {
/* 26 */                        PlatformViewsChannel2.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
/* 29 */                        result.success(null);
                            } catch (IllegalStateException e) {
/* 40 */                        result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                            }
                        }

                        private void isSurfaceControlEnabled(MethodCall methodCall, MethodChannel.Result result) {
/* 15 */                    result.success(Boolean.valueOf(PlatformViewsChannel2.this.handler.isSurfaceControlEnabled()));
                        }

                        private void setDirection(MethodCall methodCall, MethodChannel.Result result) {
/* 5 */                     Map map = (Map) methodCall.arguments();
                            try {
/* 38 */                        PlatformViewsChannel2.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
/* 41 */                        result.success(null);
                            } catch (IllegalStateException e) {
/* 52 */                        result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                            }
                        }

                        private void touch(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                     List list = (List) methodCall.arguments();
                            try {
/* 193 */                       PlatformViewsChannel2.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
/* 196 */                       result.success(null);
                            } catch (IllegalStateException e) {
/* 207 */                       result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                            }
                        }

                        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                     if (PlatformViewsChannel2.this.handler == null) {
                            }
/* 33 */                    Log.m4589v(PlatformViewsChannel2.TAG, "Received '" + methodCall.method + "' message.");
/* 36 */                    String str = methodCall.method;
/* 38 */                    str.getClass();
                            switch (str) {
                                case "create":
/* 142 */                           create(methodCall, result);
                                    break;
                                case "clearFocus":
/* 138 */                           clearFocus(methodCall, result);
                                    break;
                                case "touch":
/* 134 */                           touch(methodCall, result);
                                    break;
                                case "setDirection":
/* 130 */                           setDirection(methodCall, result);
                                    break;
                                case "isSurfaceControlEnabled":
/* 126 */                           isSurfaceControlEnabled(methodCall, result);
                                    break;
                                case "dispose":
/* 122 */                           dispose(methodCall, result);
                                    break;
                                default:
/* 118 */                           result.notImplemented();
                                    break;
                            }
                        }
                    };
/* 9 */             this.parsingHandler = methodCallHandler;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views_2", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(methodCallHandler);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static String detailedExceptionString(Exception exc) {
/* 1 */             return Log.getStackTraceString(exc);
                }

                public void invokeViewFocused(int i) {
/* 1 */             MethodChannel methodChannel = this.channel;
/* 3 */             if (methodChannel == null) {
/* 5 */                 return;
                    }
/* 12 */            methodChannel.invokeMethod("viewFocused", Integer.valueOf(i));
                }

                public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
/* 1 */             this.handler = platformViewsHandler;
                }
            }
