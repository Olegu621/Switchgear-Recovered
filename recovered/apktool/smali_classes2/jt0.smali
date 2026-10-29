.class public final synthetic Ljt0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Le90;


# instance fields
.field public final synthetic a:Lkt0;

.field public final synthetic b:Lmo2;


# direct methods
.method public synthetic constructor <init>(Lkt0;Lmo2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljt0;->a:Lkt0;

    .line 5
    .line 6
    iput-object p2, p0, Ljt0;->b:Lmo2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljt0;->b:Lmo2;

    .line 2
    .line 3
    iget-object p0, p0, Ljt0;->a:Lkt0;

    .line 4
    .line 5
    iget-object p0, p0, Lkt0;->c:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
