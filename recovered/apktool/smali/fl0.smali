.class public final Lfl0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final h:[Landroid/hardware/camera2/params/MeteringRectangle;


# instance fields
.field public final a:Ljn;

.field public volatile b:Z

.field public c:I

.field public d:[Landroid/hardware/camera2/params/MeteringRectangle;

.field public e:[Landroid/hardware/camera2/params/MeteringRectangle;

.field public f:[Landroid/hardware/camera2/params/MeteringRectangle;

.field public final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 3
    .line 4
    sput-object v0, Lfl0;->h:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljn;Lnt0;Ly92;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lfl0;->b:Z

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    iput p3, p0, Lfl0;->c:I

    .line 9
    .line 10
    sget-object p3, Lfl0;->h:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 11
    .line 12
    iput-object p3, p0, Lfl0;->d:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 13
    .line 14
    iput-object p3, p0, Lfl0;->e:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 15
    .line 16
    iput-object p3, p0, Lfl0;->f:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 17
    .line 18
    iput-boolean p2, p0, Lfl0;->g:Z

    .line 19
    .line 20
    iput-object p1, p0, Lfl0;->a:Ljn;

    .line 21
    .line 22
    return-void
.end method
