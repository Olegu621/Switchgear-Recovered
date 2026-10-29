.class public final Lgz1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lt13;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Leh0;

.field public final d:Lfz1;


# direct methods
.method public constructor <init>(Lfz1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lgz1;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lgz1;->b:Z

    .line 8
    .line 9
    iput-object p1, p0, Lgz1;->d:Lfz1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lt13;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgz1;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lgz1;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, Lgz1;->c:Leh0;

    .line 9
    .line 10
    iget-boolean v1, p0, Lgz1;->b:Z

    .line 11
    .line 12
    iget-object v2, p0, Lgz1;->d:Lfz1;

    .line 13
    .line 14
    invoke-virtual {v2, v0, p1, v1}, Lfz1;->f(Leh0;Ljava/lang/Object;Z)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p0, Lwd0;

    .line 19
    .line 20
    const-string p1, "Cannot encode a second value in the ValueEncoderContext"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public final c(Z)Lt13;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lgz1;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lgz1;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, Lgz1;->c:Leh0;

    .line 9
    .line 10
    iget-boolean v1, p0, Lgz1;->b:Z

    .line 11
    .line 12
    iget-object v2, p0, Lgz1;->d:Lfz1;

    .line 13
    .line 14
    invoke-virtual {v2, v0, p1, v1}, Lfz1;->b(Leh0;IZ)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p0, Lwd0;

    .line 19
    .line 20
    const-string p1, "Cannot encode a second value in the ValueEncoderContext"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method
