.class public final synthetic Lu62;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;


# instance fields
.field public final synthetic a:Lx62;


# direct methods
.method public synthetic constructor <init>(Lx62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu62;->a:Lx62;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onStateChanged(Lg71;Lt61;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lu62;->a:Lx62;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p1, Lt61;->ON_START:Lt61;

    .line 7
    .line 8
    if-ne p2, p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lx62;->f:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object p1, Lt61;->ON_STOP:Lt61;

    .line 15
    .line 16
    if-ne p2, p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lx62;->f:Z

    .line 20
    .line 21
    :cond_1
    return-void
.end method
