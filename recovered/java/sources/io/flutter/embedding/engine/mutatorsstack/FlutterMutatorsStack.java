            package io.flutter.embedding.engine.mutatorsstack;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public class FlutterMutatorsStack {
                private List<FlutterMutator> mutators = new ArrayList();
                private Matrix finalMatrix = new Matrix();
                private List<Path> finalClippingPaths = new ArrayList();
                private float finalOpacity = 1.0f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum FlutterMutatorType {
                    CLIP_RECT,
                    CLIP_RRECT,
                    CLIP_PATH,
                    TRANSFORM,
                    OPACITY
                }

                public List<Path> getFinalClippingPaths() {
/* 1 */             return this.finalClippingPaths;
                }

                public Matrix getFinalMatrix() {
/* 1 */             return this.finalMatrix;
                }

                public float getFinalOpacity() {
/* 1 */             return this.finalOpacity;
                }

                public List<FlutterMutator> getMutators() {
/* 1 */             return this.mutators;
                }

                public void pushClipPath(Path path) {
/* 8 */             this.mutators.add(new FlutterMutator(path));
/* 13 */            path.transform(this.finalMatrix);
/* 18 */            this.finalClippingPaths.add(path);
                }

                public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
/* 3 */             Rect rect = new Rect(i, i2, i3, i4);
/* 13 */            this.mutators.add(new FlutterMutator(rect, fArr));
/* 18 */            Path path = new Path();
/* 28 */            path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
/* 33 */            path.transform(this.finalMatrix);
/* 38 */            this.finalClippingPaths.add(path);
                }

                public void pushClipRect(int i, int i2, int i3, int i4) {
/* 3 */             Rect rect = new Rect(i, i2, i3, i4);
/* 13 */            this.mutators.add(new FlutterMutator(rect));
/* 18 */            Path path = new Path();
/* 28 */            path.addRect(new RectF(rect), Path.Direction.CCW);
/* 33 */            path.transform(this.finalMatrix);
/* 38 */            this.finalClippingPaths.add(path);
                }

                public void pushOpacity(float f) {
/* 8 */             this.mutators.add(new FlutterMutator(f));
/* 14 */            this.finalOpacity *= f;
                }

                public void pushTransform(float[] fArr) {
/* 3 */             Matrix matrix = new Matrix();
/* 6 */             matrix.setValues(fArr);
/* 11 */            FlutterMutator flutterMutator = new FlutterMutator(matrix);
/* 16 */            this.mutators.add(flutterMutator);
/* 25 */            this.finalMatrix.preConcat(flutterMutator.getMatrix());
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 17 */        public class FlutterMutator {
                    private Matrix matrix;
                    private float opacity;
                    private Path path;
                    private float[] radiis;
                    private Rect rect;
                    private FlutterMutatorType type;

                    public FlutterMutator(Rect rect, float[] fArr) {
/* 8 */                 this.opacity = 1.0f;
/* 12 */                this.type = FlutterMutatorType.CLIP_RRECT;
/* 14 */                this.rect = rect;
/* 16 */                this.radiis = fArr;
                    }

                    public Matrix getMatrix() {
/* 1 */                 return this.matrix;
                    }

                    public float getOpacity() {
/* 1 */                 return this.opacity;
                    }

                    public Path getPath() {
/* 1 */                 return this.path;
                    }

                    public Rect getRect() {
/* 1 */                 return this.rect;
                    }

                    public FlutterMutatorType getType() {
/* 1 */                 return this.type;
                    }

/* 18 */            public FlutterMutator(Rect rect) {
/* 20 */                this.opacity = 1.0f;
/* 21 */                this.type = FlutterMutatorType.CLIP_RECT;
/* 22 */                this.rect = rect;
                    }

/* 22 */            public FlutterMutator(Path path) {
/* 24 */                this.opacity = 1.0f;
/* 25 */                this.type = FlutterMutatorType.CLIP_PATH;
/* 26 */                this.path = path;
                    }

/* 26 */            public FlutterMutator(Matrix matrix) {
/* 28 */                this.opacity = 1.0f;
/* 29 */                this.type = FlutterMutatorType.TRANSFORM;
/* 30 */                this.matrix = matrix;
                    }

/* 30 */            public FlutterMutator(float f) {
/* 32 */                this.opacity = 1.0f;
/* 33 */                this.type = FlutterMutatorType.OPACITY;
/* 34 */                this.opacity = f;
                    }
                }
            }
