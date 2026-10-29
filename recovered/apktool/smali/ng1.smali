.class public final synthetic Lng1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;


# instance fields
.field public final synthetic a:Lpg1;

.field public final synthetic b:Lfh1;


# direct methods
.method public synthetic constructor <init>(Lpg1;Lfh1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lng1;->a:Lpg1;

    .line 5
    .line 6
    iput-object p2, p0, Lng1;->b:Lfh1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onStateChanged(Lg71;Lt61;)V
    .locals 1

    .line 1
    sget-object p1, Lt61;->ON_DESTROY:Lt61;

    .line 2
    .line 3
    iget-object v0, p0, Lng1;->a:Lpg1;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lng1;->b:Lfh1;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lpg1;->b(Lfh1;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method
