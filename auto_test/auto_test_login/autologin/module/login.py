import json
import logging.config
import unittest

import time
from selenium import webdriver

# 登录功能自动测试脚本
class LoginTest (unittest.TestCase):
    browser = None
    url = None
    # 加载日志配置文件
    logging.config.fileConfig('logger.conf')
    logger = logging.getLogger('login_test')

    def test_login(self):
        # 打开json配置文件
        with open('../conf.json', 'r') as conf:
            # 加载配置
            configure = json.load(conf)
            webd = configure['webdriver']
            self.url = configure['url']
            self.username = configure['username']
            self.pwd = configure['password']
        if not self.browser:
            self.browser = webdriver.Chrome(executable_path=webd)

        # 访问url对应的网址
        self.browser.get(self.url)
        # 睡眠5s，等待页面响应，这里睡眠等待也可以替换成其他方式，这里暂不使用
        time.sleep(5)
        # 找到id为L_email的元素，填充对应的值
        self.browser.find_element_by_id("L_email").send_keys(self.username)
        self.browser.find_element_by_id("L_pass").send_keys(self.pwd)
        # 找到id为submitBotton的按钮（登录），点击
        self.browser.find_element_by_id("submitBotton").click()
        time.sleep(10)
        # 退出浏览器
        self.browser.quit()

if __name__ == '__main__':
    unittest.main()