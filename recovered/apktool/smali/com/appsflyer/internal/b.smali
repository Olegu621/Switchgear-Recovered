.class public final synthetic Lcom/appsflyer/internal/b;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/appsflyer/internal/AFa1ySDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFa1ySDK;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/appsflyer/internal/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/appsflyer/internal/b;->b:Lcom/appsflyer/internal/AFa1ySDK;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/appsflyer/internal/b;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/appsflyer/internal/b;->b:Lcom/appsflyer/internal/AFa1ySDK;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1ySDK;->c(Lcom/appsflyer/internal/AFa1ySDK;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1ySDK;->d(Lcom/appsflyer/internal/AFa1ySDK;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
