.class public final synthetic Lcom/appsflyer/internal/s;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/appsflyer/internal/AFj1sSDK;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/Runnable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/appsflyer/internal/s;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/appsflyer/internal/s;->b:Lcom/appsflyer/internal/AFj1sSDK;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/appsflyer/internal/s;->c:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/appsflyer/internal/s;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/s;->c:Ljava/lang/Runnable;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/s;->b:Lcom/appsflyer/internal/AFj1sSDK;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->f(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->a(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->e(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->g(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
