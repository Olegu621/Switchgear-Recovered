.class public final Lw22;
.super Lfx0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final transient d:Ldx0;

.field public final transient e:Lx22;


# direct methods
.method public constructor <init>(Ldx0;Lx22;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw22;->d:Ldx0;

    .line 5
    .line 6
    iput-object p2, p0, Lw22;->e:Lx22;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lw22;->e:Lx22;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lzw0;->a([Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lw22;->d:Ldx0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldx0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final e()Lwx2;
    .locals 1

    .line 1
    iget-object p0, p0, Lw22;->e:Lx22;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lzw0;->g(I)Lww0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final f()Lzw0;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lw22;->d:Ldx0;

    .line 2
    .line 3
    check-cast p0, Ly22;

    .line 4
    .line 5
    iget p0, p0, Ly22;->f:I

    .line 6
    .line 7
    return p0
.end method
