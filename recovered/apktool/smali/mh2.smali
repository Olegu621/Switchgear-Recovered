.class public final Lmh2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lzy2;
.implements Ljw0;
.implements Lxn2;


# static fields
.field public static final b:Llf;


# instance fields
.field public final a:Lnq1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Llf;

    .line 2
    .line 3
    const-string v1, "camerax.core.streamSharing.captureTypes"

    .line 4
    .line 5
    const-class v2, Ljava/util/List;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lmh2;->b:Llf;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lnq1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmh2;->a:Lnq1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final k()Lty;
    .locals 0

    .line 1
    iget-object p0, p0, Lmh2;->a:Lnq1;

    .line 2
    .line 3
    return-object p0
.end method
