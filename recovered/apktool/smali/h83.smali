.class public Lh83;
.super Lf83;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public n:Lly0;

.field public o:Lly0;

.field public p:Lly0;


# direct methods
.method public constructor <init>(Lm83;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf83;-><init>(Lm83;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lh83;->n:Lly0;

    .line 6
    .line 7
    iput-object p1, p0, Lh83;->o:Lly0;

    .line 8
    .line 9
    iput-object p1, p0, Lh83;->p:Lly0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()Lly0;
    .locals 1

    .line 1
    iget-object v0, p0, Lh83;->o:Lly0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld83;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lg83;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lly0;->b(Landroid/graphics/Insets;)Lly0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lh83;->o:Lly0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lh83;->o:Lly0;

    .line 18
    .line 19
    return-object p0
.end method

.method public i()Lly0;
    .locals 1

    .line 1
    iget-object v0, p0, Lh83;->n:Lly0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld83;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lg83;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lly0;->b(Landroid/graphics/Insets;)Lly0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lh83;->n:Lly0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lh83;->n:Lly0;

    .line 18
    .line 19
    return-object p0
.end method

.method public k()Lly0;
    .locals 1

    .line 1
    iget-object v0, p0, Lh83;->p:Lly0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld83;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Ldt1;->e(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lly0;->b(Landroid/graphics/Insets;)Lly0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lh83;->p:Lly0;

    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, Lh83;->p:Lly0;

    .line 18
    .line 19
    return-object p0
.end method

.method public l(IIII)Lm83;
    .locals 0

    .line 1
    iget-object p0, p0, Ld83;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Ldt1;->j(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p0, p1}, Lm83;->h(Landroid/view/WindowInsets;Landroid/view/View;)Lm83;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public q(Lly0;)V
    .locals 0

    .line 1
    return-void
.end method
