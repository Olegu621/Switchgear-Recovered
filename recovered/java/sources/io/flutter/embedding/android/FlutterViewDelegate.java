            package io.flutter.embedding.android;

            import android.app.Activity;
            import android.content.Context;
            import android.graphics.Rect;
            import android.view.Window;
            import android.view.WindowInsets;
            import io.flutter.embedding.engine.renderer.FlutterRenderer;
            import io.flutter.util.ViewUtils;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterViewDelegate {
                public List<Rect> getCaptionBarInsets(Context context) {
/* 1 */             WindowInsets windowInsets = getWindowInsets(context);
                    return windowInsets == null ? Collections.EMPTY_LIST : windowInsets.getBoundingRects(WindowInsets.Type.captionBar());
                }

                public WindowInsets getWindowInsets(Context context) {
                    Window window;
/* 1 */             Activity activity = ViewUtils.getActivity(context);
/* 6 */             if (activity == null || (window = activity.getWindow()) == null) {
/* 5 */                 return null;
                    }
/* 20 */            return window.getDecorView().getRootWindowInsets();
                }

                public void growViewportMetricsToCaptionBar(Context context, FlutterRenderer.ViewportMetrics viewportMetrics) {
/* 1 */             List<Rect> captionBarInsets = getCaptionBarInsets(context);
/* 5 */             int iMax = viewportMetrics.viewPaddingTop;
/* 7 */             Iterator<Rect> it = captionBarInsets.iterator();
/* 15 */            while (it.hasNext()) {
/* 25 */                iMax = Math.max(iMax, it.next().bottom);
                    }
/* 30 */            viewportMetrics.viewPaddingTop = iMax;
                }
            }
