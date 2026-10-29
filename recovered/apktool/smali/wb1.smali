.class public final Lwb1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:Z

.field public final synthetic e:Lkx0;


# direct methods
.method public constructor <init>(Lkx0;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb1;->e:Lkx0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lwb1;->d:Z

    .line 8
    .line 9
    iput p2, p0, Lwb1;->a:I

    .line 10
    .line 11
    invoke-virtual {p1}, Lkx0;->e()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lwb1;->b:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lwb1;->c:I

    .line 2
    .line 3
    iget p0, p0, Lwb1;->b:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lwb1;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lwb1;->c:I

    .line 8
    .line 9
    iget v1, p0, Lwb1;->a:I

    .line 10
    .line 11
    iget-object v2, p0, Lwb1;->e:Lkx0;

    .line 12
    .line 13
    invoke-virtual {v2, v0, v1}, Lkx0;->c(II)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Lwb1;->c:I

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    add-int/2addr v1, v2

    .line 21
    iput v1, p0, Lwb1;->c:I

    .line 22
    .line 23
    iput-boolean v2, p0, Lwb1;->d:Z

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-static {}, Ln4;->o()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lwb1;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lwb1;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    iput v0, p0, Lwb1;->c:I

    .line 10
    .line 11
    iget v1, p0, Lwb1;->b:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    iput v1, p0, Lwb1;->b:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, p0, Lwb1;->d:Z

    .line 19
    .line 20
    iget-object p0, p0, Lwb1;->e:Lkx0;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lkx0;->i(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-static {}, Lf42;->t()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
