.class public final Lwb2;
.super Lcm0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final d:Ljava/lang/Object;

.field public final e:Lgw0;

.field public final f:I

.field public final i:I


# direct methods
.method public constructor <init>(Lmw0;Landroid/util/Size;Lgw0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcm0;-><init>(Lmw0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lwb2;->d:Ljava/lang/Object;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcm0;->b:Lmw0;

    .line 14
    .line 15
    invoke-interface {p1}, Lmw0;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lwb2;->f:I

    .line 20
    .line 21
    iget-object p1, p0, Lcm0;->b:Lmw0;

    .line 22
    .line 23
    invoke-interface {p1}, Lmw0;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lwb2;->i:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Lwb2;->f:I

    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lwb2;->i:I

    .line 41
    .line 42
    :goto_0
    iput-object p3, p0, Lwb2;->e:Lgw0;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final getHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lwb2;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final getWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lwb2;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final x0()Lgw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lwb2;->e:Lgw0;

    .line 2
    .line 3
    return-object p0
.end method
