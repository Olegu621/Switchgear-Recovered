.class public final Lby0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lzx0;


# direct methods
.method public constructor <init>(Lzx0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lby0;->a:Lzx0;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lby0;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    if-lt v0, v1, :cond_1

    .line 10
    .line 11
    new-instance v0, Lby0;

    .line 12
    .line 13
    new-instance v1, Lay0;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lzx0;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lby0;-><init>(Lzx0;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    new-instance v0, Lby0;

    .line 23
    .line 24
    new-instance v1, Lzx0;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lzx0;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lby0;-><init>(Lzx0;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lby0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lby0;

    .line 8
    .line 9
    iget-object p1, p1, Lby0;->a:Lzx0;

    .line 10
    .line 11
    iget-object p0, p0, Lby0;->a:Lzx0;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lzx0;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lby0;->a:Lzx0;

    .line 2
    .line 3
    iget-object p0, p0, Lzx0;->a:Landroid/hardware/camera2/params/InputConfiguration;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/hardware/camera2/params/InputConfiguration;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lby0;->a:Lzx0;

    .line 2
    .line 3
    iget-object p0, p0, Lzx0;->a:Landroid/hardware/camera2/params/InputConfiguration;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/hardware/camera2/params/InputConfiguration;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
