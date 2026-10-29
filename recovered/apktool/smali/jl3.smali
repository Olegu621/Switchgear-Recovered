.class public final Ljl3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lok3;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lsl3;


# direct methods
.method public synthetic constructor <init>(Lsl3;Lok3;JZI)V
    .locals 0

    .line 1
    iput p6, p0, Ljl3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ljl3;->b:Lok3;

    .line 4
    .line 5
    iput-wide p3, p0, Ljl3;->c:J

    .line 6
    .line 7
    iput-boolean p5, p0, Ljl3;->d:Z

    .line 8
    .line 9
    iput-object p1, p0, Ljl3;->e:Lsl3;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ljl3;->a:I

    .line 2
    .line 3
    iget-wide v1, p0, Ljl3;->c:J

    .line 4
    .line 5
    iget-boolean v3, p0, Ljl3;->d:Z

    .line 6
    .line 7
    iget-object v4, p0, Ljl3;->b:Lok3;

    .line 8
    .line 9
    iget-object p0, p0, Ljl3;->e:Lsl3;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v4}, Lsl3;->D(Lok3;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v4, v1, v2, v3}, Lsl3;->O(Lok3;JZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-virtual {p0, v4}, Lsl3;->D(Lok3;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4, v1, v2, v3}, Lsl3;->O(Lok3;JZ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
