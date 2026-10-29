            package io.flutter.embedding.engine.systemchannels;

            import io.flutter.Log;
            import io.flutter.embedding.engine.dart.DartExecutor;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.StandardMethodCodec;
            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public class PlatformViewsChannel {
                private static final String TAG = "PlatformViewsChannel";
                private final MethodChannel channel;
                private PlatformViewsHandler handler;
                private final MethodChannel.MethodCallHandler parsingHandler;

                /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class C10801 implements MethodChannel.MethodCallHandler {
                    public C10801() {
                    }

                    private void clearFocus(MethodCall methodCall, MethodChannel.Result result) {
                        try {
/* 18 */                    PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
/* 21 */                    result.success(null);
                        } catch (IllegalStateException e) {
/* 32 */                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    private void create(MethodCall methodCall, MethodChannel.Result result) {
/* 15 */                Map map = (Map) methodCall.arguments();
/* 23 */                boolean z = false;
/* 41 */                boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
/* 64 */                ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
/* 72 */                    if (z2) {
/* 123 */                       PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, byteBufferWrap));
/* 126 */                       result.success(null);
/* 129 */                       return;
                            }
/* 137 */                   if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
/* 151 */                       z = true;
                            }
/* 263 */                   long jCreateForTextureLayer = PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z ? PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBufferWrap));
/* 271 */                   if (jCreateForTextureLayer != -2) {
/* 291 */                       result.success(Long.valueOf(jCreateForTextureLayer));
                            } else {
/* 273 */                       if (!z) {
/* 286 */                           throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
/* 275 */                       result.success(null);
                            }
                        } catch (IllegalStateException e) {
/* 301 */                   result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    private void dispose(MethodCall methodCall, MethodChannel.Result result) {
                        try {
/* 26 */                    PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
/* 29 */                    result.success(null);
                        } catch (IllegalStateException e) {
/* 40 */                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static /* synthetic */ void lambda$resize$0(MethodChannel.Result result, PlatformViewBufferSize platformViewBufferSize) {
/* 1 */                 if (platformViewBufferSize == null) {
/* 8 */                     result.error("error", "Failed to resize the platform view", null);
/* 11 */                    return;
                        }
/* 14 */                HashMap map = new HashMap();
/* 26 */                map.put("width", Double.valueOf(platformViewBufferSize.width));
/* 38 */                map.put("height", Double.valueOf(platformViewBufferSize.height));
/* 41 */                result.success(map);
                    }

                    private void offset(MethodCall methodCall, MethodChannel.Result result) {
/* 5 */                 Map map = (Map) methodCall.arguments();
                        try {
/* 50 */                    PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
/* 53 */                    result.success(null);
                        } catch (IllegalStateException e) {
/* 65 */                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    private void resize(MethodCall methodCall, final MethodChannel.Result result) {
/* 5 */                 Map map = (Map) methodCall.arguments();
                        try {
/* 59 */                    PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new PlatformViewBufferResized() { // from class: io.flutter.embedding.engine.systemchannels.a
                                @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
                                public final void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
/* 1 */                             PlatformViewsChannel.C10801.lambda$resize$0(result, platformViewBufferSize);
                                }
                            });
                        } catch (IllegalStateException e) {
/* 72 */                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    private void setDirection(MethodCall methodCall, MethodChannel.Result result) {
/* 5 */                 Map map = (Map) methodCall.arguments();
                        try {
/* 38 */                    PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
/* 41 */                    result.success(null);
                        } catch (IllegalStateException e) {
/* 52 */                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    private void synchronizeToNativeViewHierarchy(MethodCall methodCall, MethodChannel.Result result) {
                        try {
/* 18 */                    PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
/* 21 */                    result.success(null);
                        } catch (IllegalStateException e) {
/* 32 */                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    private void touch(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                 List list = (List) methodCall.arguments();
                        try {
/* 193 */                   PlatformViewsChannel.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
/* 196 */                   result.success(null);
                        } catch (IllegalStateException e) {
/* 207 */                   result.error("error", PlatformViewsChannel.detailedExceptionString(e), null);
                        }
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */                 if (PlatformViewsChannel.this.handler == null) {
                        }
/* 33 */                Log.m4589v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
/* 36 */                String str = methodCall.method;
/* 38 */                str.getClass();
                        switch (str) {
                            case "create":
/* 173 */                       create(methodCall, result);
                                break;
                            case "offset":
/* 169 */                       offset(methodCall, result);
                                break;
                            case "resize":
/* 165 */                       resize(methodCall, result);
                                break;
                            case "clearFocus":
/* 161 */                       clearFocus(methodCall, result);
                                break;
                            case "synchronizeToNativeViewHierarchy":
/* 157 */                       synchronizeToNativeViewHierarchy(methodCall, result);
                                break;
                            case "touch":
/* 153 */                       touch(methodCall, result);
                                break;
                            case "setDirection":
/* 149 */                       setDirection(methodCall, result);
                                break;
                            case "dispose":
/* 145 */                       dispose(methodCall, result);
                                break;
                            default:
/* 141 */                       result.notImplemented();
                                break;
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface PlatformViewBufferResized {
                    void run(PlatformViewBufferSize platformViewBufferSize);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PlatformViewBufferSize {
                    public final int height;
                    public final int width;

                    public PlatformViewBufferSize(int i, int i2) {
/* 4 */                 this.width = i;
/* 6 */                 this.height = i2;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PlatformViewResizeRequest {
                    public final double newLogicalHeight;
                    public final double newLogicalWidth;
                    public final int viewId;

                    public PlatformViewResizeRequest(int i, double d, double d2) {
/* 4 */                 this.viewId = i;
/* 6 */                 this.newLogicalWidth = d;
/* 8 */                 this.newLogicalHeight = d2;
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
                    public static final long NON_TEXTURE_FALLBACK = -2;

                    void clearFocus(int i);

                    void createForPlatformViewLayer(PlatformViewCreationRequest platformViewCreationRequest);

                    long createForTextureLayer(PlatformViewCreationRequest platformViewCreationRequest);

                    void dispose(int i);

                    void offset(int i, double d, double d2);

                    void onTouch(PlatformViewTouch platformViewTouch);

                    void resize(PlatformViewResizeRequest platformViewResizeRequest, PlatformViewBufferResized platformViewBufferResized);

                    void setDirection(int i, int i2);

                    void synchronizeToNativeViewHierarchy(boolean z);
                }

                public PlatformViewsChannel(DartExecutor dartExecutor) {
/* 6 */             C10801 c10801 = new C10801();
/* 9 */             this.parsingHandler = c10801;
/* 17 */            MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
/* 20 */            this.channel = methodChannel;
/* 22 */            methodChannel.setMethodCallHandler(c10801);
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

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 21 */        public static class PlatformViewCreationRequest {
                    public final int direction;
                    public final RequestedDisplayMode displayMode;
                    public final double logicalHeight;
                    public final double logicalLeft;
                    public final double logicalTop;
                    public final double logicalWidth;
                    public final ByteBuffer params;
                    public final int viewId;
                    public final String viewType;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public enum RequestedDisplayMode {
                        TEXTURE_WITH_VIRTUAL_FALLBACK,
                        TEXTURE_WITH_HYBRID_FALLBACK,
                        HYBRID_ONLY
                    }

                    public PlatformViewCreationRequest(int i, String str, double d, double d2, double d3, double d4, int i2, ByteBuffer byteBuffer) {
/* 19 */                this(i, str, d, d2, d3, d4, i2, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
                    }

/* 22 */            public PlatformViewCreationRequest(int i, String str, double d, double d2, double d3, double d4, int i2, RequestedDisplayMode requestedDisplayMode, ByteBuffer byteBuffer) {
/* 24 */                this.viewId = i;
/* 25 */                this.viewType = str;
/* 26 */                this.logicalTop = d;
/* 27 */                this.logicalLeft = d2;
/* 28 */                this.logicalWidth = d3;
/* 29 */                this.logicalHeight = d4;
/* 30 */                this.direction = i2;
/* 31 */                this.displayMode = requestedDisplayMode;
/* 32 */                this.params = byteBuffer;
                    }
                }
            }
