.class public final Lbn2;
.super Lde3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic h:Lkb1;

.field public final synthetic i:Ldn2;


# direct methods
.method public constructor <init>(Ldn2;Lkb1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbn2;->i:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lbn2;->h:Lkb1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbn2;->i:Ldn2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Ldn2;->m:Z

    .line 5
    .line 6
    iget-object p0, p0, Lbn2;->h:Lkb1;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lkb1;->M(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final B(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbn2;->i:Ldn2;

    .line 2
    .line 3
    iget v1, v0, Ldn2;->c:I

    .line 4
    .line 5
    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Ldn2;->n:Landroid/graphics/Typeface;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Ldn2;->m:Z

    .line 13
    .line 14
    iget-object p0, p0, Lbn2;->h:Lkb1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, p1, v0}, Lkb1;->N(Landroid/graphics/Typeface;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
