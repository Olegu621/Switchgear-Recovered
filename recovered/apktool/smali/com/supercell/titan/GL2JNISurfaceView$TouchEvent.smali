.class public Lcom/supercell/titan/GL2JNISurfaceView$TouchEvent;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/GL2JNISurfaceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TouchEvent"
.end annotation


# static fields
.field public static final TYPE_CANCEL:I

.field public static final TYPE_DOWN:I

.field public static final TYPE_MOVE:I

.field public static final TYPE_UP:I


# instance fields
.field public id:I

.field public type:I

.field public x:I

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/GL2JNISurfaceView$TouchEvent;

    const v1, 0x13

    const v0, 0x3

    sput v0, Lcom/supercell/titan/GL2JNISurfaceView$TouchEvent;->TYPE_CANCEL:I

    const v0, 0x0

    sput v0, Lcom/supercell/titan/GL2JNISurfaceView$TouchEvent;->TYPE_DOWN:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/GL2JNISurfaceView$TouchEvent;->TYPE_MOVE:I

    const v0, 0x1

    sput v0, Lcom/supercell/titan/GL2JNISurfaceView$TouchEvent;->TYPE_UP:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
