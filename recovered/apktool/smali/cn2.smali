.class public final Lcn2;
.super Lkb1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Landroid/text/TextPaint;

.field public final synthetic i:Lkb1;

.field public final synthetic v:Ldn2;


# direct methods
.method public constructor <init>(Ldn2;Landroid/content/Context;Landroid/text/TextPaint;Lkb1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcn2;->v:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lcn2;->e:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lcn2;->f:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Lcn2;->i:Lkb1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcn2;->i:Lkb1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkb1;->M(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcn2;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcn2;->f:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Lcn2;->v:Ldn2;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, Ldn2;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcn2;->i:Lkb1;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lkb1;->N(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
